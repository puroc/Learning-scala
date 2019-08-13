package oo2

class Person2(val name: String, val age: Int){
  def say={
    println("name:"+name+",age:"+age)
  }
}

// 注意！如果是父类中接收的参数，比如name和age，子类中接收时，就不要用任何val或var来修饰了，否则会认为是子类要覆盖父类的field
class Student2(name: String, age: Int, var score: Double) extends Person2(name, age) {
  def this(name: String) {
    this(name, 0, 0)
  }
  def this(age: Int) {
    this("leo", age, 0)
  }

  override def say: Unit = println("name:"+name+",age:"+age+",score:"+score)
}
