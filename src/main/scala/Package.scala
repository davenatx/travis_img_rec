package com

import com.typesafe.config.ConfigFactory

package object austindata {
  private val config = ConfigFactory.load()

  /* Program Properties */
  lazy val yearToProcess = config.getString("com.austindata.yearToProcess")
  lazy val csvFile = config.getString("com.austindata.csvFile")
  lazy val repositoryPath = config.getString("com.austindata.repositoryPath")
  lazy val preindexDirectory = config.getString("com.austindata.preindexDirectory")

  case class ImgRec(i_docNum: String, i_volPage: String, i_docType: String, i_fileYear: String, i_fileMd: String, r_docNum: String, r_volPage: String, r_docType: String, r_fileYear: String, r_fileMd: String)
}