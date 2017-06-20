package com.austindata

import com.typesafe.scalalogging.LazyLogging
import scala.annotation.tailrec

import java.io.File
import java.io.FilenameFilter
import java.nio.file.Files
import java.nio.file.StandardCopyOption.{ COPY_ATTRIBUTES, REPLACE_EXISTING }
import java.nio.file.Paths

/* FilenameFilter that returns all of the files begining with the fileName */
class MyFileFilter(filenamePrefix: String) extends FilenameFilter {
  def accept(directory: File, filename: String): Boolean = {
    if (filename.startsWith(filenamePrefix + ".")) true
    else false
  }
}

object CopyFiles extends LazyLogging {

  /* Copy a list of files */
  private def copyFiles(files: List[File]) {
    @tailrec
    def copy(xs: List[File]): Unit = xs match {
      case List() =>
      case head :: tail => {
        performCopy(head.getCanonicalPath, preindexDirectory + "/" + head.getName)
        copy(tail)
      }
    }
    copy(files)
  }

  /* Use nio to perform copy */
  private def performCopy(sourceFile: String, destinationFile: String) {
    logger.info(s"Copying: ${sourceFile} to: ${destinationFile}")
    val nioSourceFile = Paths.get(sourceFile)
    val nioDestinationFile = Paths.get(destinationFile)
    Files.copy(nioSourceFile, nioDestinationFile, REPLACE_EXISTING)
  }

  /* Convert the monthDay into MM/DD.  This assumes the length is 4 */
  private def splitMd(md: String): String = {
    md.substring(0, 2) + "/" + md.substring(2, 4)
  }

  /* Return List of Files for this document number */
  private def getFiles(docNum: String, fileYy: String, fileMd: String): List[File] = {
    val monthDay = fileMd.length match {
      case 3 => {
        splitMd("0" + fileMd)
      }
      case 4 => {
        splitMd(fileMd)
      }
      case _ => {
        logger.warn(s"Problem with FileMd: ${fileMd}!  Document Number: ${docNum}")
        ""
      }
    }

    val path = repositoryPath + "/" + fileYy + "/" + monthDay + "/"
    new File(path).listFiles(new MyFileFilter(docNum)).toList
  }

  /**
   * Take a list of ImgRec, build the path to the Image Repository for the "I" images and copy
   * them to the PreIndex folder
   */
  def process(records: List[ImgRec]) {
    @tailrec
    def copyRecord(xs: List[ImgRec]): Unit = xs match {
      case List() =>
      case head :: tail => {
        val files = getFiles(head.i_docNum, head.i_fileYear, head.i_fileMd)
        logger.info(s"Processing DocNum: ${head.i_docNum}, FileYear: ${head.i_fileYear}, FileMd: ${head.i_fileMd}, Files: ${files}")
        copyFiles(files)
        copyRecord(tail)
      }
    }
    copyRecord(records)
  }
}