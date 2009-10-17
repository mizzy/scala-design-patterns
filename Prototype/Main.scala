import framework._

object Main {
  def main(args: Array[String]) {
    val manager = new Manager()

    val upen = new UnderLinePen('~')
    val mbox = new MessageBox('*')
    val sbox = new MessageBox('/')

    manager.register("strong message", upen)
    manager.register("warning box", mbox)
    manager.register("slash box", sbox)

    val p1 = manager.create("strong message")
    p1.use("Hello, world.")
    val p2 = manager.create("warning box")
    p2.use("Hello, world")
    val p3 = manager.create("slash box")
    p3.use("Hello, world")
  }
}
