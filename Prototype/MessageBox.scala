import framework._

class MessageBox(d: Char) extends Product {
  private val decochar = d

  def use(s: String) {
    val length: Int = s.getBytes().length
    for ( i <- 0 to length + 3 ) {
      print(decochar)
    }
    println("")
    println(decochar + " " + s + " " + decochar)
    for ( i <- 0 to length + 3 ) {
      print(decochar)
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
