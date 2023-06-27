// Date 07/01/23

import java.util.Scanner;

public class more_patterns {
	public static void hollow_rec(int a, int b) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (i == 1 || i == a || j == 1 || j == b) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void half_pyramid(int rows) {
		for (int i = 1; i <= rows; i++) {
			System.out.print(" ");

			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void nip(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void floyd(int rows) {
		int ch = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

	public static void triangle_01(int rows) {

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0)
					System.out.print(0);
				else
					System.out.print(1);
			}
			System.out.println();
		}
	}

	public static void butterfly(int rows) {

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 2 * (rows - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 2 * (rows - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void hollow_rhombus(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rows; j++) {
				if (i == 1 || i == rows || j == 1 || j == rows) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void Diamond(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = size; i >= 1; i--) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void Palindrome_pyramid(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("\t1.hollow rectangle");
		System.out.println("\t2.half_pyramid");
		System.out.println("\t3.num_inverted_pyramid");
		System.out.println("\t4.floyd's triangle");
		System.out.println("\t5.triangle_01");
		System.out.println("\t6.butterfly");
		System.out.println("\t7.hollow_rhombus");
		System.out.println("\t8.Diamond");
		System.out.println("\t9.Palindrome_pyramid");
		Scanner scanf = new Scanner(System.in);
		System.out.print("Enter choice and value : ");
		int choice = scanf.nextInt();
		System.out.println("\n");
		switch (choice) {
			case 1:
				System.out.println("Enter rows and columns : ");
				hollow_rec(scanf.nextInt(), scanf.nextInt());
				break;
			case 2:
				half_pyramid(scanf.nextInt());
				break;
			case 3:
				nip(scanf.nextInt());
				break;
			case 4:
				floyd(scanf.nextInt());
				break;
			case 5:
				triangle_01(scanf.nextInt());
				break;
			case 6:
				butterfly(scanf.nextInt());
				break;
			case 7:
				hollow_rhombus(scanf.nextInt());
				break;
			case 8:
				Diamond(scanf.nextInt());
				break;
			case 9:
				Palindrome_pyramid(scanf.nextInt());
				break;
			default:
				System.out.println("wrong choice");
				break;
		}

	}
//Coded By Tejas
}



