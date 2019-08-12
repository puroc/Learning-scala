package basic

import scala.collection.mutable.ArrayBuffer

object TestArray {

  def main(args: Array[String]): Unit = {
    //    testArray
    //    testArrayBuffer
//    testTraverse
    testOperation
  }

  private def testOperation = {
    // 数组元素求和
    val a = Array(1, 2, 3, 4, 5)
    val sum = a.sum
    // 获取数组最大值
    val max = a.max
    // 对数组进行排序
    scala.util.Sorting.quickSort(a)
    // 获取数组中所有元素内容
    println(a.mkString)
    println(a.mkString(", "))
    println(a.mkString("<", ",", ">"))
    // toString函数
    println(a.toString)
  }

  //遍历
  private def testTraverse = {
    var a = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i <- a) {
      println(i)
    }

    for (i <- 0 until(a.length, 2)) {
      println(a(i))
    }
  }

  private def testArrayBuffer = {
    val b = ArrayBuffer[Int]()
    //添加一个元素
    b += 1
    //添加多个元素
    b += (2, 3, 4, 5)
    // 使用++=操作符，可以添加其他集合中的所有元素
    b ++= Array(6, 7, 8, 9, 10)

    // 使用insert()函数可以在指定位置插入元素
    // 但是这种操作效率很低，因为需要移动指定位置后的所有元素
    b.insert(1, 100)
    b.foreach(println(_))
    // 使用remove()函数可以移除指定位置的元素
    //    b.remove(1)
    b.remove(1, 3)
    println("------------------")
    b.foreach(println(_))

  }

  private def testArray = {
    //创建数组方式1
    val a = Array("hello", "world")
    a.iterator.foreach(println(_))

    //创建数组方式2
    val b = new Array[Int](10)
    b(1) = 100
    b.iterator.foreach(println(_))

    //如果数组中的初始值类型不同时，返回的类型为Array[Any]
    val c = Array("hello", 1)
    c.iterator.foreach(println(_))
  }
}
