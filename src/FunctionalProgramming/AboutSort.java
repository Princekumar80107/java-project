package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "[Title: " + title
                + " , Author: " + author + "]";
    }
}

public class AboutSort {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", "J.K. Rowling"));
        books.add(new Book("Merchant of Venice", "William Shakespeare"));
        books.add(new Book("Into the Wild", "Jon Krakauer"));
        books.add(new Book("Mastering Physics", "H.C. Verma"));
        books.add(new Book("The Last Mughal", "William Dalrymple"));

        System.out.println(books);

//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return Integer.compare(o1.title.length(), o2.title.length());
//            }
//        });

        // Collections.sort(books, (b1, b2) -> Integer.compare(b1.title.length(), b2.title.length()));

        books.sort((b1, b2) -> Integer.compare(b1.title.length(), b2.title.length()));

        System.out.println(books);
    }
}
