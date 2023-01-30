import java.nio.channels.NotYetBoundException;
import java.util.Scanner;

public class input_in_java {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // creating scan object
		// String input = scan.next();
		// System.out.println(input);

		System.out.print("Enter name : ");
		String name = scan.nextLine();
		System.out.print("your name : ");
		System.out.println(name);

		// int input
		System.out.print("Enter number : ");
		int num = scan.nextInt();
		System.out.print("your number : ");
		System.out.println(num);

		System.out.print("Enter number : ");
		float decimal = scan.nextFloat();
		System.out.print("your number : " + decimal);
		System.out.println();

		boolean is = scan.nextBoolean();
		System.out.println(is);

	}
}
