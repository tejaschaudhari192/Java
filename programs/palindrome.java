import java.util.Scanner;

public class palindrome {
	public static int reverse(int n) {
		int rev = 0;
		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scan.nextInt();
		if (num == reverse(num)) {
			System.out.println("its palindrome number");
		}

	}
}
