package OOPs.Constructor;
public class Student {
    final String name;
    int birthYear;
    String gender;

    Student(String name, int birthYear, String gender) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        StringBuffer sbuf = new StringBuffer();

        sbuf.append("Name: ").append(name).append('\n').append("Birth Year: ").append(birthYear).append('\n').append("Gender: ").append(gender);
        sb.append("Name: ").append(name).append('\n').append("Birth Year: ").append(birthYear).append('\n').append("Gender: ").append(gender);

        return sbuf.toString();
    }
}
