package listfactory
import factory._

class ListFactory extends Factory {
  def createLink(caption: String, url: String): Link = {
    return new ListLink(caption, url)
  }

  def createTray(caption: String): Tray = {
    return new ListTray(caption)
  }

  def createPage(title: String, author: String): Page = {
    return new ListPage(title, author)
  }
}
