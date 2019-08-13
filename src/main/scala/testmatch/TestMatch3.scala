package testmatch

import java.io._

object TestMatch3 {

  def processException(e: Exception) {
    e match {
      case e1: IllegalArgumentException => println("you have illegal arguments! exception is: " + e1)
      case e2: FileNotFoundException => println("cannot find the file you need read or write!, exception is: " + e2)
      case e3: IOException => println("you got an error while you were doing IO operation! exception is: " + e3)
      case _: Exception => println("cannot know which exception you have!" )
    }
  }

  def main(args: Array[String]): Unit = {
    processException(new FileNotFoundException("readme file is not exist."))
  }
}
