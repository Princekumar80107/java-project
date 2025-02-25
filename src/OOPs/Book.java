package OOPs;

public class Book {
    int size = 3;
    String[] bookTitle = new String[size];
    int i = 0;

    void addBook(String name) {
        bookTitle[i] = name;
        i++;
    }

    void remove(String name)  {
        int index = 0;
        for(int i = 0; i < 3; i++) {
            if(bookTitle[i].equals(name)) {
                index = i;
                break;
            }
        }

        for(int k = index; k < 2; k++) {
            bookTitle[k] = bookTitle[k + 1];
        }

        bookTitle[size - 1] = "";
    }

    void bookPrint() {
        for(String name: bookTitle) {
            System.out.printf("%s \n", name);
        }
    }

}
