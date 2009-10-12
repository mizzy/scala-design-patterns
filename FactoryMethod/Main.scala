import framework._
import idcard._

object Main {
  def main(args: Array[String]) {
    val factory = new IDCardFactory()

    val card1 = factory.create("結城浩")
    val card2 = factory.create("とむら")
    val card3 = factory.create("佐藤花子")

    card1.use()
    card2.use()
    card3.use()
  }
}
