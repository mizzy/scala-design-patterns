object Main {
  def main(args: Array[String]) {
    val d1 = new CharDisplay('H')
    val d2 = new StringDisplay("Hello, world.")
    val d3 = new StringDisplay("こんにちは。")

    d1.display()
    d2.display()
    d3.display()
  }
}
