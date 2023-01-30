import java.util.Scanner;

public class largest {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("enter fno : ");
		int a = scan.nextInt();
		System.out.print("enter sno : ");
		int b = scan.nextInt();
		if (a>b) {
			System.out.println(a+" is larger");
		}
		else{
			System.out.println(b+" is larger");
		}
	}
}
