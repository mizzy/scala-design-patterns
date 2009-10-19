package tablefactory
import factory._

class TableFactory extends Factory {
  def createLink(caption: String, url: String): Link = {
    return new TableLink(caption, url)
  }

  def createTray(caption: String): Tray = {
    return new TableTray(caption)
  }

  def createPage(title: String, author: String): Page = {
    return new TablePage(title, author)
  }
}
