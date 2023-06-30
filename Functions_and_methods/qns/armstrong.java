import java.lang.Math;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        int n = Integer.parseInt(in);
        int l = in.length();
        int sum=0;
        int bkp = n;
        // System.out.println(l);
        while (n!=0) {
            int rem = n%10;
            n = n/10;
            sum += Math.pow(rem,l);
        }
        System.out.println(sum==bkp);
    }
}
