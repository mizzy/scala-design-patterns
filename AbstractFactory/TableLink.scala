package tablefactory
import factory._

class TableLink(caption: String, url: String) extends Link(caption, url) {
  def makeHTML(): String = {
    return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n"
  }
}
