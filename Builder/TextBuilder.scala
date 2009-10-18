class TextBuilder extends Builder {
  private val buffer = new StringBuffer()

  def makeTitle(title: String) {
    buffer.append("================================\n")
    buffer.append("『" + title + "』\n")
    buffer.append("\n")
  }

  def makeString(str: String) {
    buffer.append('■' + str + "\n")
    buffer.append("\n")
  }

  def makeItems(items: List[String]) {
    for ( i <- 0 to items.length - 1 ) {
      buffer.append(" ・" + items(i) + "\n")
    }
    buffer.append("\n")
  }

  def close() {
    buffer.append("================================\n")
  }

  def getResult(): String = {
    return buffer.toString()
  }

}
