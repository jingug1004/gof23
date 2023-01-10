package A01Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public boolean hasNext() {
//        if (index < bookShelf.getLength()) {
        if (index < bookShelf.getBookListLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
//        Book book = bookShelf.getBookAt(index);
        Book book = bookShelf.getBookListAt(index);
        index++;
        return book;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super Book> action) {
        Iterator.super.forEachRemaining(action);
    }
}