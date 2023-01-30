import java.util.*;

public class continue_st {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		do {
			int n = scan.nextInt();
			if (n % 10 == 0) {
				continue;
			}

			System.out.println(n);
		} while (true);
	}
}
