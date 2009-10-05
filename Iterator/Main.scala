object Main {
  def main(args: Array[String]) {
    val bookShelf = new BookShelf(4)

    bookShelf.appendBook(new Book("Around the World in 80 Days"))
    bookShelf.appendBook(new Book("Bible"))
    bookShelf.appendBook(new Book("Cinderella"))
    bookShelf.appendBook(new Book("Daddy-Long-Legs"))
    
    val it = bookShelf.iterator()

    while ( it.hasNext() ) {
      val book = it.next()
      println(book.name)
    }
  }
}
