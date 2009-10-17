import framework._

class UnderLinePen(c: Char) extends Product {
  private val ulchar = c

  def use(s: String) {
    val length: Int = s.getBytes().length
    println("\"" + s + "\"")
    print(" ")
    for ( i <- 0 to length ) {
      print(ulchar)
    }
    println("")
  }

  def createClone(): Product = {
    var p: Product = null
    try {
      p = clone().asInstanceOf[Product]
    } catch {
      case e: CloneNotSupportedException =>
        e.printStackTrace()
    }
    return p
  }
}
