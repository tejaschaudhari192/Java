import java.util.Scanner;

public class income_tax_calc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float tax = 0;
		System.out.print("Enter salary : ");
		float salary = scan.nextFloat();

		if (salary < 500000) {
			tax = 0;
		} else if (salary >= 500000 && salary <= 1000000) {
			tax = salary * 0.2f;
		} else {
			tax = salary * 0.3f;
		}

		System.out.println("your tax on $" + salary + " is " + tax);
	}
}
