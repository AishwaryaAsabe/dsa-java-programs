public class Sb {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("H");
        sb.append("ello");
        System.out.println(sb);
        sb.replace(0, sb.length(), "Bye");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
