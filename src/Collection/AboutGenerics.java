//package Collection;
//
//
//import java.util.*;
//
//// Enum for book genres
//enum Genre {
//    FICTION, NON_FICTION, SCIENCE, HISTORY
//}
//
//// Enum for book status
//enum BookStatus {
//    AVAILABLE, CHECKED_OUT
//}
//
//// Book class with generics friendly design (Comparable for default sorting by title)
//class Book implements Comparable<Book> {
//    private String title;
//    private String author;
//    private Genre genre;
//    private BookStatus status;
//
//    public Book(String title, String author, Genre genre, BookStatus status) {
//        this.title = title;
//        this.author = author;
//        this.genre = genre;
//        this.status = status;
//    }
//
//    // Getters
//    public String getTitle() { return title; }
//    public String getAuthor() { return author; }
//    public Genre getGenre() { return genre; }
//    public BookStatus getStatus() { return status; }
//
//    // Default sorting by title
//    @Override
//    public int compareTo(Book other) {
//        return this.title.compareTo(other.title);
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Book[Title='%s', Author='%s', Genre=%s, Status=%s]",
//                title, author, genre, status);
//    }
//}
//
//// Comparator to sort books by status (AVAILABLE first)
//class BookStatusComparator implements Comparator<Book> {
//    @Override
//    public int compare(Book b1, Book b2) {
//        return b1.getStatus().compareTo(b2.getStatus());
//    }
//}
//
//// Generic utility class for collection operations
//class CollectionUtils {
//    // Method to filter a list based on a given predicate
//    public static <T> List<T> filter(List<T> list, java.util.function.Predicate<T> predicate) {
//        List<T> result = new ArrayList<>();
//        for (T item : list) {
//            if (predicate.test(item)) {
//                result.add(item);
//            }
//        }
//        return result;
//    }
//}
//
//public class AboutGenerics {
//    public static void main(String[] args) {
//        // Creating a collection of books
//        List<Book> library = new ArrayList<>();
//        library.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", Genre.FICTION, BookStatus.AVAILABLE));
//        library.add(new Book("A Brief History of Time", "Stephen Hawking", Genre.SCIENCE, BookStatus.CHECKED_OUT));
//        library.add(new Book("Sapiens", "Yuval Noah Harari", Genre.HISTORY, BookStatus.AVAILABLE));
//        library.add(new Book("1984", "George Orwell", Genre.FICTION, BookStatus.CHECKED_OUT));
//        library.add(new Book("The Selfish Gene", "Richard Dawkins", Genre.SCIENCE, BookStatus.AVAILABLE));
//
//        // Sorting books by title using Comparable (default)
//        Collections.sort(library);
//        System.out.println("Books sorted by title:");
//        library.forEach(System.out::println);
//        System.out.println();
//
//        // Sorting books by status using Comparator
//        Collections.sort(library, new BookStatusComparator());
//        System.out.println("Books sorted by status (AVAILABLE first):");
//        library.forEach(System.out::println);
//        System.out.println();
//
//        // Using the generic utility to filter only AVAILABLE books
//        List<Book> availableBooks = CollectionUtils.filter(library, book -> book.getStatus() == BookStatus.AVAILABLE);
//        System.out.println("Available books:");
//        availableBooks.forEach(System.out::println);
//    }
//}