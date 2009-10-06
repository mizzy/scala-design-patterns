class CharDisplay(c: Char) extends AbstractDisplay {
  private val ch: Char = c


  def open() {
    print("<<")
  }

  def echo() {
    print(ch)
  }

  def close() {
    println(">>")
  }
}
