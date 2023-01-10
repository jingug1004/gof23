package A01Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BookShelf implements Iterable<Book> {
    private Book[] books;

    private List<Book> bookList;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public BookShelf(int initialsize, String tempString) {
        this.bookList = new ArrayList<>(initialsize);
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public Book getBookListAt(int index) {
        return bookList.get(index);
    }

    public void appedBookList(Book book) {
        bookList.add(book);
    }

    public int getBookListLength() {
        return bookList.size();
    }

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    @Override
    public void forEach(Consumer<? super Book> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Book> spliterator() {
        return Iterable.super.spliterator();
    }
}