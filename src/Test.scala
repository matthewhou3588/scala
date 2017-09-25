import Array._

object Test {
  def main(args: Array[String]) {
    /*
    1.to(3).foreach(i=>{println(i)})

    println("he" + 1.toChar.toString + "d")

    add(1, 20)
    printHello()

    delayed(time())


    var arr = Array.ofDim[Int](10)
    for (i <- 0 to arr.length-1) {
      arr(i) = (new util.Random()).nextInt(100)
    }
    println(arr.toSeq)
    findMaxInArray(arr)

    val arr2 = Array(-1, -2, -3)
    val newArr = concat(arr, arr2)
    println(newArr.toSeq)
    */

    val newarr = (1 to 10).map(_*2)
    println(newarr)

    var A:Map[Char, Int] = Map()
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

    val nums:Map[Int, Int] = Map()

    println("keys:" + colors.keys)
    println("values: " + colors.values)
    println("isEmpty: " + colors.isEmpty)

    val colors2 = Map("red" -> "#FF0000", "yellow" -> "#FFFF00")

    val mergedMap = colors ++ colors2
    mergedMap.keys.foreach(i => print(i + ": " + mergedMap(i) + ", "))
    // println(colors ++ colors2)

    val tuple = (1.2, "hello", 'f')
    println(tuple._2)
    println(tuple.toString())

    tuple.productIterator.foreach(i => println(i + ", "))
  }

  def findMaxInArray(arr: Array[Int]): Unit = {
    var max = arr(0)

    for (i <- 1 to arr.length-1) {
      if (arr(i) > max)
        max = arr(i)
    }

    println("max = " + max)
  }

  def add(a:Int, b:Int): Int = {
    println(a+b)

    return a+b
  }

  def printHello(): Unit = {
    println("hello")
  }

  def time() = {
    println("获取时间，单位为纳秒")
    System.nanoTime
  }

  def delayed( t: => Long ) = {
    println("delayed内：")
    println("参数：" + t)
  }
}
