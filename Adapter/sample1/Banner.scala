class Banner(s: String) {
  private val string = s

  def showWithParen() = {
    println("(" + string + ")");
  }

  def showWithAster() = {
    println("*" + string + "*");
  }
}
