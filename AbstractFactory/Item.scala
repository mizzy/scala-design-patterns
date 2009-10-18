package factory

abstract class Item(s: String) {
  protected val caption = s
  def makeHTML(): String
}
