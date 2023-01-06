import java.util.Scanner;

public class type_conversion {
	public static void main(String[] args) {

		// byte -> short -> int -> flaot -> long -> double

		byte a = 4;
		long b = a;
		// short c = b;
		System.out.println(b);

		Scanner scan = new Scanner(System.in);
		float num = scan.nextInt();
		System.out.print("you entered ");
		System.out.println(num);
	}
}
