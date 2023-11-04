import java.util.Scanner;

public class linear_search {
	public static int search(int a[], int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10 };
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int res = search(arr, n);
		if (res == -1) {
			System.out.println("There is not a number found");
		} else
			System.out.println("The number Found at index " + res);
	}
}
