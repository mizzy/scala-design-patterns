package factory

abstract class Factory {
  def createLink(caption: String, url: String): Link
  def createTray(caption: String): Tray
  def createPage(title: String, author: String): Page
}

object Factory {
  def getFactory(c: String): Factory = {
    val classname = c
    var factory: Factory = null
    try {
      factory = Class.forName(classname).newInstance().asInstanceOf[Factory]
    } catch {
      case e: ClassNotFoundException =>
        Console.err.println("クラス " + classname + " が見つかりません。")
      case e: Exception =>
        e.printStackTrace()
    }
    return factory
  }
}
