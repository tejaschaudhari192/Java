import java.util.Scanner;

public class reverse_of_num {
	public static void main(String[] args) {
		int rev = 0, rem;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.print(rev);
	}

}