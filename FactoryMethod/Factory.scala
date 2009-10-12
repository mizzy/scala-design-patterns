package framework

abstract class Factory {
  final def create(owner: String): Product = {
    val p  = createProduct(owner)
    registerProduct(p)
    return p
  }
  protected def createProduct(owner: String): Product
  protected def registerProduct(product: Product): Unit
}
