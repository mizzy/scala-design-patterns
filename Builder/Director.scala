class Director(b: Builder) {
  val builder = b

  def construct() {
    builder.makeTitle("Greeting")
    builder.makeString("朝から昼にかけて")
    builder.makeItems(List(
      "おはようございます。",
      "こんにちは。"
    ))
    builder.makeString("夜に")
    builder.makeItems(List(
      "こんばんは。",
      "おやすみなさい。",
      "さようなら。"
    ))
    builder.close()
  }
}
