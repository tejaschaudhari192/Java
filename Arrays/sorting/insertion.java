// package sorting;

public class insertion {
	public static void sort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int curr = arr[i];
			int j = i - 1;
			while ((curr > arr[j]) && (j >= 0)) {
				arr[j + 1] = arr[j];
				System.out.println("6");
				j--;
			}
			arr[j + 1] = curr;
		}
	}

	public static void main(String[] args) {
		int a[] = { 9, 1, 7, 3, 6, 4, 5 };
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
