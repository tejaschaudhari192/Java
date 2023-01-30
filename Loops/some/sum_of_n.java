import java.util.Scanner;

public class sum_of_n {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter n : ");
		int n = scan.nextInt();
		int i = 1,sum=0;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("sum is : " + sum);
	}
}
