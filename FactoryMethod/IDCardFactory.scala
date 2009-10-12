package idcard
import framework._
import java.util._
import scala.collection.mutable.ArrayBuffer

class IDCardFactory extends Factory {
  private val owners = new ArrayBuffer[String]()

  protected def createProduct(owner: String): Product = {
    return new IDCard(owner)
  }

  protected def registerProduct(product: Product): Unit = {
    owners += product.asInstanceOf[IDCard].getOwner()
  }

  def getOwners() {
    return owners
  }
}
