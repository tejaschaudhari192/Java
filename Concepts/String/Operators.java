public class Operators {
    public static void main(String[] args) {
        System.out.println("a" + "b");
        // System.out.println('a');
        // System.out.println('a'+'b');
        System.out.println((int) 'a');
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 3);

        // System.out.println(new Integer(30) + new int[] {1,2});
        // + only with primitives and complex objects(at least one of this object is
        // string)
        System.out.println(new Integer(5) + " " + new int[] { 1, 2 });

        System.out.println("================================================================");

        String Series = "";
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            Series += (c + ", ");
        }
        // O(n2)
        System.out.println(Series);

    }
}
