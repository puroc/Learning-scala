package testmatch


class MatchPerson
case class MatchTeacher(name: String, subject: String) extends MatchPerson
case class MatchStudent(name: String, classroom: String) extends MatchPerson

object TestMatch5{

  def judgeIdentify(p: MatchPerson) {
    p match {
      case MatchTeacher(name, subject) => println("Teacher, name is " + name + ", subject is " + subject)
      case MatchStudent(name, classroom) => println("Student, name is " + name + ", classroom is " + classroom)
      case _ => println("Illegal access, please go out of the school!")
    }
  }

  def main(args: Array[String]): Unit = {
    judgeIdentify(new MatchStudent("jack","room001"))
  }
}