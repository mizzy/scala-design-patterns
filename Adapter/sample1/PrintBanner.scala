class PrintBanner(s: String) extends Banner(s) with Print {
  def printWeak() = {
    showWithParen()
  }

  def printStrong = {
    showWithAster()
  }
}
