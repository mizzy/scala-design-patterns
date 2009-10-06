abstract class AbstractDisplay {
  def open()
  def echo()
  def close()
  final def display() {
    open()
    for ( i <- 0 to 4 ) {
      echo()
    }
    close()
  }
}
