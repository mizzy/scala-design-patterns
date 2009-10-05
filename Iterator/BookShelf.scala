class BookShelf(maxsize: Int) extends Aggregate {
  private val books = new Array[Book](maxsize)
  private var last  = 0

  def getBookAt(index: Int): Book = {
    return books(index)
  }

  def appendBook(book: Book) = {
    this.books(last) = book
    last += 1
  }

  def getLength(): Int = {
    return last
  }

  def iterator(): BookShelfIterator = {
    return new BookShelfIterator(this)
  }

}

