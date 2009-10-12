package idcard
import framework._

class IDCard(o: String) extends Product {
  private val owner = o
  println(owner + "のカードを作ります。")

  def use() {
    println(owner + "のカードを使います。")
  }

  def getOwner(): String = {
    return owner
  }
}
