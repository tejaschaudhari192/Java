import java.util.Scanner;

public class ternery_op {
	public static void main(String[] args) {
		int a = 5, b = 1;
		int max = (a > b) ? a : b;
		System.out.println("largest is " + max);

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scan.nextInt();
		String type = (num % 2 == 0) ? "even" : "odd";
		System.out.println("given number is " + type);

		

	}
}
