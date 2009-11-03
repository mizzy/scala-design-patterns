class CountDisplay(i: DisplayImpl) extends Display(i) {
  def multiDisplay(times: Int) {
    open()
    for ( i <- 0 to times - 1 ) {
      print()
    }
    close()
  }
}
