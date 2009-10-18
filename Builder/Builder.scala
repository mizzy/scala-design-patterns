abstract class Builder {
  def makeTitle(title: String): Unit
  def makeString(str: String): Unit
  def makeItems(items: List[String]): Unit
  def close(): Unit
}
