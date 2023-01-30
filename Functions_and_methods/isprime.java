// package Functions_and_methods;

import java.util.*;

public class isprime {
	public static boolean Isprime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scan.nextInt();
		System.out.println("given number is " + Isprime(num));
	}
}
