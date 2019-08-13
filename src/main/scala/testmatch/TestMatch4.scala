package testmatch

object TestMatch4 {

  def greeting1(arr: Array[String]) {
    arr match {
      case Array("Leo") => println("Hi, Leo!")
      case Array(girl1, girl2, girl3) => println("Hi, girls, nice to meet you. " + girl1 + " and " + girl2 + " and " + girl3)
      case Array("Leo", _*) => println("Hi, Leo, please introduce your friends to me.")
      case _ => println("hey, who are you?")
    }
  }

  def greeting2(list: List[String]) {
    list match {
      case "Leo" :: Nil => println("Hi, Leo!")
      case girl1 :: girl2 :: girl3 :: Nil => println("Hi, girls, nice to meet you. " + girl1 + " and " + girl2 + " and " + girl3)
      case "Leo" :: tail => println("Hi, Leo, please introduce your friends to me.")
      case _ => println("hey, who are you?")
    }
  }


  def main(args: Array[String]): Unit = {
    greeting2("Leo" :: "Tom" :: Nil)
  }

}
