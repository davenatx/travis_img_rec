package com.austindata

import scala.io.Source
import com.typesafe.scalalogging.LazyLogging
import scala.annotation.tailrec

object CSVParser extends LazyLogging {

  type Line = String

  /**
   * Passe the CSV file, compare the I record and R record Volume/Pages and file dates and log any
   * entries that do not match.  Store each entry as an ImgRec.
   *
   * Finally, convert the list of ImgRec to a Set and back to a list to remove duplicates
   */
  def parse: List[ImgRec] = {

    @tailrec
    def parseLine(xs: List[Line], acc: List[ImgRec]): List[ImgRec] = xs match {
      case List() => acc
      case head :: tail => {

        /* Split the line on the comma */
        val arr = head.split(",")

        /* Read tokens into variables incase addtional formatting or resting is necessary */
        val i_docNum = arr(0)
        val i_volPage = arr(1)
        val i_docType = arr(2)
        val i_fileYear = arr(3)
        val i_fileMd = arr(4)
        val r_docNum = arr(5)
        val r_volPage = arr(6)
        var r_docType = arr(7)
        val r_fileYear = arr(8)
        val r_fileMd = arr(9)

        /* Compare I record Vol/Pg with R record Vol/Pg */
        if (i_volPage != r_volPage) {
          logger.warn(s"Volume/Page Mismatch!  Document Number: ${i_docNum} I record has VolPage: ${i_volPage} and R record has VolPage: ${r_volPage}")
        }

        /* Compare I record FileYear with R record FileYear */
        if (i_fileYear != r_fileYear) {
          logger.warn(s"FileYear Mismatch!  Document Number: ${i_docNum} I record has FileYear: ${i_fileYear} and R record has FileYear: ${r_fileYear}")
        }

        /* Compare I record FileMd with R record FileMd */
        if (i_fileMd != r_fileMd) {
          logger.warn(s"FileMd Mismatch!  Document Number: ${i_docNum} I record has FileMd: ${i_fileMd} and R record has FileMd: ${r_fileMd}")
        }

        parseLine(tail, ImgRec(i_docNum, i_volPage, i_docType, i_fileYear, i_fileMd, r_docNum, r_volPage, r_docType, r_fileYear, r_fileMd) :: acc)
      }
    }

    /* parsed records */
    val records = parseLine(Source.fromFile(csvFile).getLines.toList, Nil)
    /* deduped records by converting to set and back to list */
    val dedupedRecords = records.toSet.toList
    logger.warn(s"Parsed record length: ${records.length}, Deduped Record Length: ${dedupedRecords.length}")
    dedupedRecords
  }
}