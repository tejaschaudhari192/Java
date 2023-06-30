import java.util.Arrays;
import java.util.Scanner;

public class kk {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        Scanner scan = new Scanner(System.in);

        for (int i : a)
            System.out.print(i + " ");

        System.out.println(Arrays.toString(a));

        String s[] = new String[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = scan.next();
        }
        s[1] = "kinro";
        System.out.println(Arrays.toString(s));
    }
}