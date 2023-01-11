package A01Iterator;

import java.util.Iterator;

public class BookMainIterator {

    public static void main(String[] args) {
//        BookShelf bookShelf = new BookShelf(4);
//        bookShelf.appendBook(new Book("Around the World in 80 Days"));
//        bookShelf.appendBook(new Book("Bible"));
//        bookShelf.appendBook(new Book("Cinderella"));
//        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
//
//        Iterator<Book> iterator = bookShelf.iterator();
//        while (iterator.hasNext()) {
//            Book book = iterator.next();
//            System.out.println(book.getName());
//        }
//
//        System.out.println("1");
//
//        for (Book book : bookShelf) {
//            System.out.println(book.getName());
//        }
//
//        System.out.println("22");

        BookShelf bookShelfList = new BookShelf(4, "initial");
        bookShelfList.appedBookList(new Book("Around the World in 80 Days"));
        bookShelfList.appedBookList(new Book("Bible"));
        bookShelfList.appedBookList(new Book("Cinderella"));
        bookShelfList.appedBookList(new Book("Daddy-Long-Legs"));
        bookShelfList.appedBookList(new Book("East of Eden"));
        bookShelfList.appedBookList(new Book("Frankenstein"));
        bookShelfList.appedBookList(new Book("Gulliver's Travels"));
        bookShelfList.appedBookList(new Book("Hamlet"));

        Iterator<Book> bookIterator = bookShelfList.iterator();
        while (bookIterator.hasNext()) {
            Book book = bookIterator.next();
            System.out.println("l~ " + book.getName());
        }

        System.out.println("333");

        for (Book book : bookShelfList) {
            System.out.println("l~ " + book.getName());
        }

        System.out.println("4444");
    }

}
