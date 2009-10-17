package framework
import scala.collection.mutable.Map

class Manager {
  private val showcase = Map[String, Product]()

  def register(name: String, proto: Product): Unit = {
    showcase += (name -> proto)
  }

  def create(protoname: String): Product = {
    val p: Product = showcase(protoname)
    return p.createClone()
  }
}
