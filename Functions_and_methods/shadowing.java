public class shadowing {
    static int x = 12;

    public static void main(String[] args) {
        int x;
        // System.out.println(x); // error
        x = 10;
        System.out.println("in main : " + x);
        outer();
    }

    static void outer() {
        System.out.println("in outer : " + x);
    }
}
