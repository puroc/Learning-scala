package testImplicit

class SpecialPerson(val name: String)

class SpecialStudent(val name: String)

class SpecialOlder(val name: String)

object TestImplicit1 {

  implicit def object2SpecialPerson(obj: Object): SpecialPerson = {
    if (obj.getClass == classOf[SpecialStudent]) {
      val stu = obj.asInstanceOf[SpecialStudent];
      new SpecialPerson(stu.name)
    }
    else if (obj.getClass == classOf[SpecialOlder]) {
      val SpecialOlder = obj.asInstanceOf[SpecialOlder];
      new SpecialPerson(SpecialOlder.name)
    }
    else {
      new SpecialPerson("")
    }
  }

  var ticketNumber = 0

  //当传入的参数不是SpecialPerson类型时，scala会去有没有哪个隐式转换方法可以转换成SpecialPerson的，如果有就自动调用
  def buySpecialTicket(p: SpecialPerson) = {
    ticketNumber += 1
    "T-" + ticketNumber
  }

  def main(args: Array[String]): Unit = {
    println(buySpecialTicket(new SpecialStudent("tom")))
    println(buySpecialTicket(new SpecialOlder("jack")))
  }

}
