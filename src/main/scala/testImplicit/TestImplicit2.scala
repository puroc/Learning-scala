package testImplicit


class Man(val name: String)

class Superman(val name: String) {
  def emitLaser = println("emit a laster!")
}

class Superman2(val name: String) {
}


object TestImplicit2 {

  implicit def man2superman(man: Man): Superman = new Superman(man.name)


  def main(args: Array[String]): Unit = {

    val leo = new Man("leo")
    //当调用Man对象的emitLaser方法时，发现Man这个类没有emitLaser方法，此时scala就会去损招有没有哪个隐式转换方法接收的是Man这个类，并且转换之后的类有emitLaser这个方法，
    //若找到了这样的隐式转换类就会自动执行转换方法
    leo.emitLaser
  }

}
