package oo

// Scala中，可以给类定义多个辅助constructor，类似于java中的构造函数重载
// 辅助constructor之间可以互相调用，而且必须第一行调用主constructor
class Student2{
  private var name = ""
  private var age = 0
  def this(name: String) {
    this()
    this.name = name
  }
  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }
}
