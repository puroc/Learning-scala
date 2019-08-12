package basic

object TestFor {

  def main(args: Array[String]): Unit = {
//    forTo
//
//    forUntil
//
//    doubleFor

//    conditionFor

    var list = for(i <- 1 to 10) yield i
    list


  }

  private def conditionFor = {
    for (i <- 1 to 100 if i % 2 == 0) println(i)
  }

  //  双重for循环
  private def doubleFor = {
    for (i <- 1 to 9; j <- 1 to 9) {
      if (j == 9) {
        println(i * j)
      } else {
        print(i * j + " ")
      }
    }
  }
  //    11 until 20 不包含上边界
  private def forUntil = {
    for (j <- 11 until 20) {
      println(j)
    }
  }

  //    1 to 10 包含上边界
  private def forTo = {
    for (i <- 1 to 10) {
      println(i)
    }
  }
}
