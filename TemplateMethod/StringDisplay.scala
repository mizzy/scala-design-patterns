class StringDisplay(s: String) extends AbstractDisplay {
  private val string = s
  private val width: Int = string.getBytes.length

  def open() {
    printLine()
  }

  def echo() {
    println("|" + string + "|")
  }

  def close() {
    printLine()
  }

  private def printLine() {
    print("+")
    for ( i <- 0 to width - 1 ) {
      print("-")
    }
    println("+")
  }
}
