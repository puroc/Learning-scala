package oo


object TestOO {

  def main(args: Array[String]): Unit = {
//    var hw = new HelloWorld2
//    hw.sayHello()
//    println(hw.getName)
//
//    testGetterSetter

//    var leo = new Student
//    leo.age = 1
//    var tom = new Student
//    tom.age = 2
//    println(leo.compareAge(tom))

//    new Student3("jack",20)
//
//    new Student4("lily")

    Teacher("lucy",25).sayHello


  }

  //测试自定义getter和setter方法
  private def testGetterSetter = {
    val leo = new Student
    leo.name = "tom"
    println(leo.name)
  }
}
