package oo

// 如果有一个class，还有一个与class同名的object，那么就称这个object是class的伴生对象，class是object的伴生类
// 伴生类和伴生对象必须存放在一个.scala文件之中
// 伴生类和伴生对象，最大的特点就在于，互相可以访问private field

object Teacher {

  private val eyeNum = 2

  def getEyeNum = eyeNum

  def apply(name: String, age: Int): Teacher = new Teacher(name, age)
}

class Teacher(val name: String, val age: Int) {
  def sayHello = println("Hi, " + name + ", I guess you are " + age + " years old!" + ", and usually you must have " + Teacher.eyeNum + " eyes.")


}