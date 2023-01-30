public class pairs_ele {
	public static void pairer(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7, 9, 11 };
		pairer(a);
	}
}
