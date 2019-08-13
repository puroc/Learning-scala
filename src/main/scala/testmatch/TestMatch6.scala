package testmatch

object TestMatch6 {

  val grades = Map("Leo" -> "A", "Jack" -> "B", "Jen" -> "C")

  def getGrade(name: String) {
    val grade = grades.get(name)
    grade match {
      case Some(grade) => println("your grade is " + grade)
      case None => println("Sorry, your grade information is not in the system")
    }
  }

  def main(args: Array[String]): Unit = {
    getGrade("Leo")
    getGrade("lili")

  }

}
