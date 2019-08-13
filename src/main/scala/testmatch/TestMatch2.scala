package testmatch

object TestMatch2 {

  def main(args: Array[String]): Unit = {
    def judgeGrade(name: String, grade: String) {
      grade match {
        case "A" => println(name + ", you are excellent")
        case "B" => println(name + ", you are good")
        case "C" => println(name + ", you are just so so")

        //可以在case后的条件判断中，不仅仅只是提供一个值，而是可以在值后面再加一个if守卫，进行双重过滤
        case _grade if name == "leo" => println(name + ", you are a good boy, come on, your grade is " + _grade)

        //可以将模式匹配的默认情况，下划线，替换为一个变量名，此时模式匹配语法就会将要匹配的值赋值给这个变量，从而可以在后面的处理语句中使用要匹配的值
        case _grade => println("you need to work harder, your grade is " + _grade)
      }
    }

  }

}
