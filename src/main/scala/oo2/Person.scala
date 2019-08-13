package oo2

class Person {
  private var name = "leo"
  def getName = name
}
class Student extends Person {
  private var score = "A"
  def getScore = score
  override def getName = "Hi, I'm " + super.getName
}


