package framework

trait Product extends java.lang.Cloneable {
  def use(s: String): Unit
  def createClone(): Product
  override def clone(): Cloneable = {
    super.clone()
    this
  }
}
