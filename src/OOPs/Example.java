package OOPs;

public class Example {

    public static void main(String[] args)
    {
        Book math = new Book();
        math.addBook("NCERT Class 9TH");
        math.addBook("NCERT Class 10th");
        math.addBook("RD Sharma");
        math.bookPrint();

        math.remove("NCERT Class 10th");
        math.bookPrint();
    }
}
