package framework

@cloneable trait Product {
  def use(s: String): Unit
  def createClone(): Product
}
