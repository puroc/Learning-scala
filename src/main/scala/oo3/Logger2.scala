package oo3

// 有时我们可以在创建类的对象时，指定该对象混入某个trait，这样，就只有这个对象混入该trait的方法，而类的其他对象则没有
trait Logger2 {
  def log(msg: String) {}
}

trait MyLogger extends Logger2 {
  override def log(msg: String) {
    println("log: " + msg)
  }
}

class Cat3(val name: String) extends Logger2 {
  def sayHello {
    println("Hi, I'm " + name);
    log("sayHello is invoked!")
  }
}

object Test3 {
  def main(args: Array[String]): Unit = {
    val p1 = new Cat3("leo")
    p1.sayHello
    val p2 = new Cat3("jack") with MyLogger
    p2.sayHello
  }
}

