class BookShelfIterator(bookShelf: BookShelf) extends Iterator {
  private var index = 0

  def hasNext(): Boolean = {
    if ( index < bookShelf.getLength() ) {
      return true
    }
    else {
      return false
    }
  }

  def next(): Book = {
    val book = bookShelf.getBookAt(index)
    index += 1
    return book
  }

}
