package factory
import scala.collection.mutable.ArrayBuffer
import java.io._

abstract class Page(t: String, a: String) {
  protected val title = t
  protected val author = a
  protected val content = new ArrayBuffer[Item]()

  def add(item: Item) {
    content += item
  }

  def output() {
    try {
      val filename = title + ".html"
      val writer = new FileWriter(filename)
      writer.write(this.makeHTML())
      writer.close()
      println(filename + " を作成しました。")
    } catch {
      case e: IOException =>
        e.printStackTrace()
    }
  }
  def makeHTML(): String
}
