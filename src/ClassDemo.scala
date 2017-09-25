

object ClassDemo {
  def main(args: Array[String]): Unit = {
    /*
    val pt = new Point(10, 20)
    pt.move(10, 10)

    val loc = new Location(10, 20 ,30)
    loc.move(-10, -20, -30)
    */

    val fred = new Employee
    fred.name = "Fred"
    fred.salary = 500
    println(fred)
  }
}

class Person(val name: String) {
  var age: Int = 0
  var sex: Char = 'f'

  println("main constructor...")

  // auxiliary  constructor
  def this(name: String, age: Int) {
    this(name)   // call main constructor
    this.age = age
  }

  // auxiliary  constructor
  def this(name: String, age: Int, sex: Char) {
    this(name, age)
    this.sex = sex
  }

  override def toString = getClass.getName + "[name=" + name + "]"
}

/*
class Employee(salary: Double) extends Person(val name: String) {
  var salary = 0.0

  this(name)

  def this(name: String, salary: Double) {
    this(salary)

  }
  override def toString: String = super.toString + "[salary=" + salary + "]"

}
*/

class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x += dx
    y += dy
    println("x: " + x)
    println("y: " + y)
  }
}

class Location(val xc: Int, val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x += dx
    y += dy
    z += dz

    println("x: " + x)
    println("y: " + y)
    println("z: " + z)
  }
}



