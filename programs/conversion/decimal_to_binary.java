import java.util.Scanner;

public class decimal_to_binary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scan.nextInt();
		int ans = 0, n = num, r, power = 0;
		while (n != 0) {
			r = n % 2;
			ans += r * (int) Math.pow(10, power);
			n = n / 2;
			power++;
		}
		System.out.println(ans);
	}
}
