public class max_of_arr {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 66, 8, 10 };
		int max = -32000;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
