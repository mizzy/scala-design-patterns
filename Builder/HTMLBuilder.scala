import java.io._

class HTMLBuilder extends Builder {
  private var filename: String = null
  private var writer: PrintWriter = null

  def makeTitle(title: String) {
    filename = title + ".html"
    try {
      writer = new PrintWriter(new FileWriter(filename))
    } catch {
      case e: IOException =>
        e.printStackTrace()
    }
    writer.println("<html><head><title> + title + </title></head><body>")
    writer.println("<h1>" + title + "</h1>")
  }

  def makeString(str: String) {
    writer.println("<p>" + str + "</p>")
  }

  def makeItems(items: List[String]) {
    writer.println("<ul>")
    for ( i <- 0 to items.length - 1 ) {
      writer.println("<li>" + items(i) + "</li>")
    }
    writer.println("</ul>")
  }

  def close() {
    writer.println("</body></html>")
    writer.close()
  }

  def getResult(): String = {
    return filename
  }
}

        
