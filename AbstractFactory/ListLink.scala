package listfactory
import factory._

class ListLink(caption: String, url: String) extends Link(caption, url) {
  def makeHTML(): String = {
    return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n"
  }
}
