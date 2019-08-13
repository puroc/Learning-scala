package testmatch

object TestMatch1 {
  def judgeGrade(grade: String) {
    grade match {
      case "A" => println("Excellent")
      case "B" => println("Good")
      case "C" => println("Just so so")
      case _ => println("you need work harder")
    }
  }

  def main(args: Array[String]): Unit = {
    judgeGrade("A")
    judgeGrade("D")
  }

}
