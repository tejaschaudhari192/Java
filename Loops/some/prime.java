import java.util.*;

public class prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter num : ");
		int n = scan.nextInt();

		boolean prime = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {

			if (n % i == 0) {
				prime = false;
			}
		}
		if (prime) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
