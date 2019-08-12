package basic

object TestMap {

  def main(args: Array[String]): Unit = {
    //    testCreate

//    testModify

    testZip

  }

  private def testZip = {
    val names = Array("leo", "jack", "mike")
    val ages = Array(30, 24, 26)
    val nameAges = names.zip(ages)
    for ((name, age) <- nameAges) println(name + ": " + age)
  }

  private def testTraverse = {
    var a = Map((1, 1), (2, 2), (3, 3))
    // 遍历map的entrySet
    for ((key, value) <- a) {
      println(key + " " + value)
    }
    // 遍历map的key
    for (key <- a.keySet) {
      println(key)
    }
    // 遍历map的value
    for (value <- a.values) {
      println(value)
    }
    // 生成新map，反转key和value
    for ((key, value) <- a) yield {
      (value, key)
    }

  }

  private def testModify = {
    var a = Map((1, 1), (2, 2), (3, 3))

    //添加元素
    a += ((4, 4), (5, 5))
    for ((k, v) <- a) {
      println("k:" + k + ",v:" + v)
    }

    //移除元素
    a -= 5
    for ((k, v) <- a) {
      println("k:" + k + ",v:" + v)
    }

  }

  private def testCreate = {
    // 创建一个不可变的Map，Map中的值不允许改变
    var a = Map("Leo" -> 30, "Jen" -> 25, "Jack" -> 23)
    //下面这行代码编译错误，因为这是不可变Map。
    //    a("Leo") = 31


    // 创建一个可变的Map，Map中的值允许改变
    var b = scala.collection.mutable.Map("Leo" -> 30, "Jen" -> 25, "Jack" -> 23)
    b("Leo") = 31
    println("Leo:" + b("Leo"))
    println(b.contains("Leo"))

    // 使用另外一种方式定义不可变Map
    var c = Map(("Leo", 30), ("Jen", 25), ("Jack", 23))

    // 创建一个空的HashMap
    var d = new scala.collection.mutable.HashMap[String, Int]
  }
}
