import java.util.Scanner;

public class syntax {
	public static String name() {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		scan.close();		
		return name;
	}
	public static void main(String[] args) {
		System.out.println(name());
	}
}
