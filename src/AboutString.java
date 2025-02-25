public class AboutString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Good Afternoon ");
        System.out.println(sb);

        sb.append("Everyone");
        System.out.println(sb);

        sb.insert(4, "y");
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);

//        sb.reverse();
//        System.out.println(sb);

        sb.delete(5, 14);
        System.out.println(sb);
    }
}
