import java.util.Scanner;

public class input_of_two {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter fno : ");
		int a = scan.nextInt();
		System.out.print("Enter sno : ");
		int b = scan.nextInt();
		int sum = a + b;
		System.out.print("sum is : ");
		System.out.println(sum);
		int product = a * b;
		System.out.print("product is : ");
		System.out.println(product);
	}
}
