package oo2

abstract class Person4(val name: String) {

  //抽象方法
  def sayHello: Unit

  //抽象字段
  val age: Int

}

class Student4(name: String) extends Person4(name) {
  def sayHello: Unit = println("Hello, " + name + ",age:" + age)

  val age: Int = 30
}
