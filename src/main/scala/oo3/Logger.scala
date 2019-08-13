package oo3


trait Logger {
  //在Trait中定义具体的字段，在子类中可以使用
  val eyeNum:Int =2

  //在Trait中定义具体方法，在子类中可以使用
  def log(message: String) = println(message)
}

class Cat2(val name: String) extends Logger {
  def makeFriends(p: Cat2) {
    println("Hi, I'm " + name + ", I'm glad to make friends with you, " + p.name)
    log("makeFriends methdo is invoked with parameter Person[name=" + p.name + "]")
  }
}

object Test2{
  def main(args: Array[String]): Unit = {
    new Cat2("jack").makeFriends(new Cat2("tom"))
  }
}