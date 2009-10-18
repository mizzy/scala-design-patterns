package factory

abstract class Link(s: String, u: String) extends Item(s) {
  protected val url = u
}
