import java.util.Scanner;

public class sum_of_digits {
	public static int sum(int n) {
		int sum=0;
		while (n!=0) {
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = scan.nextInt();
		System.out.println("sum of digits : "+sum(num));
	}
}
