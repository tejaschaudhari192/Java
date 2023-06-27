import java.util.Scanner;

// package qns;

public class replace_0_with_1 {
	public static void main(String[] args) {
		System.out.print("Enter number : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		String num_str = Integer.toString(num);
		String res = "";

		for (int i = 0; i < num_str.length(); i++) {

			if (num_str.charAt(i) == '0') {
				res += '1';
			} else
				res += num_str.charAt(i);
		}
		System.out.println();
		System.out.println(res);

	}
}
