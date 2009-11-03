class Display(i: DisplayImpl) {
  val impl = i

  def open() {
    impl.rawOpen()
  }

  def print() {
    impl.rawPrint()
  }

  def close() {
    impl.rawClose()
  }

  final def display() {
    open()
    print()
    close()
  }

}
