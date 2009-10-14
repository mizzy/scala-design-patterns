class Singleton {
  println("インスタンスを生成しました。")
}

object Singleton {
  private val singleton = new Singleton
  def getInstance(): Singleton = {
    return singleton
  }
}
