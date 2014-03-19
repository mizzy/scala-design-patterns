class StringDisplayImpl(s: String) extends DisplayImpl {
  val string = s
  val width  = string.getBytes().length

  def rawOpen() {
    printLine()
  }
  
  def rawPrint() {
    println("|" + string + "|")
  }

  def rawClose() {
    printLine()
  }

  private def printLine() {
    print("+")
    for ( i <- 0 until width) {
      print("-")
    }
    println("+")
  }
}
