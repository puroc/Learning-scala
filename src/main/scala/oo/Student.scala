package oo

class Student {
  private var myName = "leo"

   var age = 0

  def name = {
    "your name is " + myName
  }

  def name_=(newValue: String) {
    print("you cannot edit your name!!!")
  }

  //如果上面的age增加了private[this]关键字，则s.age处会出现编译错误，因为private[this]修饰的字段只能在对象内部访问，
  //而compareAge的参数是外部传进来的Student对象，这个传进来的对象的age字段在当前这个类对象中使用了。所以这是不允许的
  def compareAge(s: Student): Boolean = {
    this.age > s.age
  }

}
