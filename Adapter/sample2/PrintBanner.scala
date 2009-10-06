class PrintBanner(s: String) extends Print {
  private val banner = new Banner(s)

  def printWeak() {
    banner.showWithParen()
  }

  def printStrong() {
    banner.showWithAster()
  }

}
