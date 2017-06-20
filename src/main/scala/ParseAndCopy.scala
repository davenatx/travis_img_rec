package com.austindata

import java.io.File

object ParseAndCopy extends App {

  val csv = new File(csvFile)
  if (!csv.exists) {
    throw new Exception("CSV File Does Not Exist!")
  }

  val repository = new File(repositoryPath)
  if (!repository.exists) {
    throw new Exception("Repostiory Path Does Not Exist!")
  }

  val preindex = new File(preindexDirectory)
  if (!preindex.exists) {
    throw new Exception("Preindex Directory Does Not Exist!")
  }

  val records = CSVParser.parse
  CopyFiles.process(records)
}

