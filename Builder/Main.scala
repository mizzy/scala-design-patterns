object Main {
  def main(args: Array[String]) {
    if ( args.length != 1 ) {
      usage()
      exit(0)
    }

    if ( args(0) equals "plain" ) {
      val textbuilder = new TextBuilder()
      val director = new Director(textbuilder)
      director.construct()
      val result = textbuilder.getResult()
      println(result)
    }
    else if ( args(0) equals "html" ) {
      val htmlbuilder = new HTMLBuilder()
      val director = new Director(htmlbuilder)
      director.construct()
      val filename = htmlbuilder.getResult()
      println(filename + "が作成されました。")
    }
    else {
      usage()
      exit(0)
    }
  }

  def usage() {
    println("Usage: scala Main plain   プレーンテキストで文書作成")
    println("Usage: scala Main html    HTML ファイルで文書作成")
  }

}
