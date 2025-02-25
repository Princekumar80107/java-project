package Collection;
import java.util.*;
import java.util.function.Predicate;

// Define the Book class with title, author, genre, and status.
class Book {
    public String title;
    public String author;
    public Genre genre;
    public BookStatus status;

    public Book(String title, String author, Genre genre, BookStatus status) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.status = status;
    }

    @Override
    public String toString() {
        return "[Title: " + title
                + " , Author: " + author
                + " , Genre: " + genre
                + " , Status: " + status + "]";
    }
}

// Define enums for Genre and BookStatus.
enum Genre {
    FICTION, NON_FICTION, SCIENCE, HISTORY
}

enum BookStatus {
    AVAILABLE, CHECKED_OUT
}

// A generic Utility class to perform operations on any type T.
class Utility<T> {

    public T find(List<T> list, Predicate<T> predicate) {
        for (T element : list) {
            if (predicate.test(element)) {
                return element;
            }
        }
        return null;
    }
    public List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a list of books.
        List<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", "J.K. Rowling", Genre.FICTION, BookStatus.AVAILABLE));
        books.add(new Book("Merchant of Venice", "William Shakespeare", Genre.FICTION, BookStatus.AVAILABLE));
        books.add(new Book("Into the Wild", "Jon Krakauer", Genre.NON_FICTION, BookStatus.CHECKED_OUT));
        books.add(new Book("Mastering Physics", "H.C. Verma", Genre.SCIENCE, BookStatus.AVAILABLE));
        books.add(new Book("The Last Mughal", "William Dalrymple", Genre.HISTORY, BookStatus.CHECKED_OUT));

        // Sort books by title.
        System.out.println("Sorted list of books by title:");
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.title.compareToIgnoreCase(b2.title);
            }
        });
        books.forEach(System.out::println);

        // Sort books by status.
        System.out.println("\nSorted list of books by status:");
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.status.compareTo(b2.status);
            }
        });
        books.forEach(System.out::println);

        // Create an instance of Utility for Book.
        Utility<Book> bookUtility = new Utility<Book>();

        // Use Scanner for user input.
        Scanner sc = new Scanner(System.in);

        // Find a book by title or author.
        System.out.println("\nEnter the name or author of the book to find its details:");
        String searchTerm = sc.nextLine();


        Book foundBook = bookUtility.find(books, new Predicate<Book>() {
            @Override
            public boolean test(Book book) {
                return book.title.equals(searchTerm) || book.author.equals(searchTerm);
            }
        });


        if (foundBook != null) {
            System.out.println("Found book: " + foundBook);
        } else {
            System.out.println("No book found matching: " + searchTerm);
        }

        // Filter books by a given genre.
        System.out.println("\nEnter a genre (FICTION, NON_FICTION, SCIENCE, HISTORY) to filter books:");
        String genreInput = sc.nextLine().toUpperCase();
        Genre genreFilter;

        genreFilter = Genre.valueOf(genreInput);

        List<Book> filteredBooks = bookUtility.filter(books, new Predicate<Book>() {
            @Override
            public boolean test(Book book) {
                return book.genre.equals(genreFilter);
            }
        });

        System.out.println("Filtered books by genre (" + genreFilter + "):");
        filteredBooks.forEach(System.out::println);
    }
}
