package Collection;

// it is a data types for defining a fixed set of constants

enum Color {
    RED, GREEN, BLUE, ORANGE;
}

enum Day {
    MONDAY("Start of Week"),
    TUESDAY(""),
    WEDNESDAY(""),
    THRUSDAY(""),
    FRIDAY(""),
    SATURDAY("Weekend is Start"),
    SUNDAY("Today is Relax Day");

    private String message;

    Day(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

public class AboutEnums {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        System.out.println(Day.SATURDAY + ": " + Day.SATURDAY.getMessage());
    }
}
