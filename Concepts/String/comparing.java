public class comparing {
    public static void main(String[] args) {
        String a = new String("a");
        String b = new String("a");
        
        System.out.println(a == b);

        // == checks whether these two strings are pointing to the same string

        System.out.println(a.equals(b));
    }
}
