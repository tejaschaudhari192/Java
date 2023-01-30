import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter fno : ");
		int a = scan.nextInt();
		System.out.print("Enter sno : ");
		int b = scan.nextInt();
		System.out.print("Enter operator : ");
		char op = scan.next().charAt(0);

		System.out.print("ans : ");
		switch (op) {
			case '+':
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.println(a / b);
				break;

			default:
				System.out.println("invalid operator");
				break;
		}
	}
}
