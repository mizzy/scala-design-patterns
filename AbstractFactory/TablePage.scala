package tablefactory
import factory._

class TablePage(title: String, author: String) extends Page(title, author) {
  def makeHTML(): String = {
    val buffer = new StringBuffer()
    buffer.append("<html><head><title>" + title + "</title></head>\n")
    buffer.append("<body>\n")
    buffer.append("<h1>" + title + "</h1>\n")
    buffer.append("<table witdh=\"80%\" border=\"3\">\n")
    val it = content.elements
    while ( it.hasNext ) {
      val item = it.next
      buffer.append("<tr>" + item.makeHTML() + "</tr>")
    }
    buffer.append("</table>\n")
    buffer.append("<hr><address>" + author + "</address>")
    buffer.append("</body></html>\n")
    return buffer.toString()
  }
}
