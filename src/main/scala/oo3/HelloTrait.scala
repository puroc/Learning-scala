package oo3

//把trait当成接口使用，在trait中定义抽象方法，子类需要实现
trait HelloTrait {
  //在trait中定义抽象字段，子类需要实现
  val eyeNum: Int

  //在trait中定义抽象方法，子类需要实现
  def sayHello(name: String)
}

trait MakeFriendsTrait {
  def makeFriends(p: Cat)
}

class Cat(val name: String) extends HelloTrait with MakeFriendsTrait with Cloneable with Serializable {

  def getEyeNum = println(this.eyeNum)

  override val eyeNum: Int = 2

  override def sayHello(name: String): Unit = println("Hello, " + name)

  override def makeFriends(p: Cat): Unit = println("Hello, my name is " + name + ", your name is " + p.name)
}

object Test {
  def main(args: Array[String]): Unit = {
    var cat = new Cat("jack")
    cat.sayHello("tom")
    cat.makeFriends(new Cat("tom"))
    cat.getEyeNum
  }

}