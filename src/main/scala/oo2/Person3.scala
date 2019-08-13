class Person3(protected val name: String) {
  def sayHello = "Hello, I'm " + name
}

object Person3{

  //匿名内部类写法一，在创建Person3对象的后面，直接重写Person3的sayHello方法，这种类没有名字，是一种匿名内部类
  val p = new Person3("leo") {
    override def sayHello = "Hi, I'm " + name
  }

  //匿名内部类写法二，在greeting方法中传入Person3类型的变量，并直接在Person3后面重写sayHello方法，这也是一种匿名内部类
  def greeting(p: Person3 { def sayHello: String }) {
    println(p.sayHello)
  }
}


