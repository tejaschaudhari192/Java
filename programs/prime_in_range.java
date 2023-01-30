// package programs;

import java.util.Scanner;

public class prime_in_range {
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
		for (int i = 2; i < num; i++) {
			if ((Isprime(i))) {
				System.out.print(i + ", ");
			}
		}

	}
}