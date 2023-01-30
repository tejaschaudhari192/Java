package Functions_and_methods;

// Date : 07/01/23

import java.util.*;

public class nCr {
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scan.nextInt();
		System.out.print("Enter r : ");
		int r = scan.nextInt();
		int ncr = fact(n) / (fact(r)*fact(n - r));

		System.out.println(ncr);
	}
}