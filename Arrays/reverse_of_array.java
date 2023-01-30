
import java.util.*;;

public class reverse_of_array {
	public static void PrintArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
	}

	public static void Reverse(int arr[]) {
		int s = 0, e = arr.length - 1;
		while (s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Reverse(a);
		PrintArray(a);
	}
}
