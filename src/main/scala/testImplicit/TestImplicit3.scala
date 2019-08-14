package testImplicit

class SignPen {
  def write(content: String) = println(content)
}

object TestImplicit3 {

  implicit val signPen = new SignPen

  def signForExam(name: String) (implicit signPen: SignPen) {
    signPen.write(name + " come to exam in time.")
  }

  def main(args: Array[String]): Unit = {
    signForExam("tom")
  }

}
