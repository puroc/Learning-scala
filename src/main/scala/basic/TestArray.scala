package basic

object TestArray {

  def main(args: Array[String]): Unit = {
    //创建数组方式1
    val a = Array("hello", "world")
    a.iterator.foreach(println(_))

    //创建数组方式2
    val b = new Array[Int](10)
    b(1)=100
    b.iterator.foreach(println(_))

    //如果数组中的初始值类型不同时，返回的类型为Array[Any]
    val c = Array("hello", 1)
    c.iterator.foreach(println(_))
  }


}
