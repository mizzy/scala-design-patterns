package factory
import scala.collection.mutable.ArrayBuffer

abstract class Tray(s: String) extends Item(s) {
  protected val tray = new ArrayBuffer[Item]()

  def add(item: Item) {
    tray += item
  }

}
