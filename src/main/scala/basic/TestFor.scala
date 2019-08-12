package basic

object TestFor {

  def main(args: Array[String]): Unit = {
//    1 to 10 包含上边界
    for (i <- 1 to 10) {
      println(i)
    }

//    11 until 20 不包含上边界
    for (j <- 11 until 20){
      println(j)
    }


  }
}
