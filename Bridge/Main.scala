object Main {
  def main(args: Array[String]) {
    val d1 = new Display(new StringDisplayImpl("Hello, Japan."))
    val d2 = new CountDisplay(new StringDisplayImpl("Hello, World."))
    val d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."))

    d1.display()
    d2.display()
    d3.display()
    d3.multiDisplay(5)
  }
}
