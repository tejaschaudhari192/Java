import java.util.Scanner;

// package programs.conversion;

public class binary_to_decimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int ans = 0, digit = 0, n = num, power = 0;
		while (n != 0) {
			digit = n % 10;
			ans += digit * (int) Math.pow(2, power);
			n = n / 10;
			power++;
		}
		System.out.println(ans);
	}
}
