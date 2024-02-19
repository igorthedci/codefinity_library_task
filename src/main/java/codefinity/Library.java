package codefinity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    public List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBookById(int id) {
        List<Book> removedList = new ArrayList<>();
        for (Book aBook : books) {
            if (aBook.getId() == id) {
                removedList.add(aBook);
            }
        }
        books.removeAll(removedList);
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> filterList = new ArrayList<>();
        for (Book aBook : books) {
            if (aBook.getAuthor().equals(author)) {
                filterList.add(aBook);
            }
        }
        return filterList;
    }

    public List<Book> findBooksPublishedAfterYear(int year) {
        List<Book> filterList = new ArrayList<>();
        for (Book aBook : books) {
            if (aBook.getYear() > year) {
                filterList.add(aBook);
            }
        }
        return filterList;
    }

    public void displayAllBooks() {

        System.out.print(books);
        System.out.print('\n');
    }
}
