import factory._

object Main {
  def main(args: Array[String]) {
    if ( args.length != 1 ) {
      println("Usage: scala Main class.name.of.ConcreteFactory")
      println("Example 1: scala Main listfactory.ListFactory")
      println("Example 2: scala Main tablefactory.TableFactory")
      exit(0)
    }
    val factory = Factory.getFactory(args(0))

    val asahi = factory.createLink("朝日新聞", "http://www.asahi.com")
    val yomiuri = factory.createLink("読売新聞", "http://yomiuri.co.jp")

    val us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com")
    val jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp")
    val excite = factory.createLink("Excite", "http://www.excite.com")
    val google = factory.createLink("Google", "http://www.google.com")

    val traynews = factory.createTray("新聞")
    traynews.add(asahi)
    traynews.add(yomiuri)

    val trayyahoo = factory.createTray("Yahoo")
    trayyahoo.add(us_yahoo)
    trayyahoo.add(jp_yahoo)

    val traysearch = factory.createTray("サーチエンジン")
    traysearch.add(trayyahoo)
    traysearch.add(excite)
    traysearch.add(google)

    val page = factory.createPage("LinkPage", "結城 浩")
    page.add(traynews)
    page.add(traysearch)
    page.output()
  }
}
