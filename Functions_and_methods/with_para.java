import java.util.Scanner;

public class with_para {
	public static int add_of_two(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter fno : ");
		int n1 = scan.nextInt();
		System.out.print("Enter sno : ");
		int n2 = scan.nextInt();
		System.out.println("Sum is : " + add_of_two(n1, n2));
	}
}
