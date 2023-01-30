package Subarray;
public class max_subarray_sum {

	public static void Subarray(int arr[]) {
		int max_sum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int curr_sum = 0;
				for (int j2 = i; j2 < j; j2++) {
					curr_sum += arr[j2];
				}
				if (curr_sum > max_sum) {
					max_sum = curr_sum;
				}
			}
		}
		System.out.println("Max sum : " + max_sum);
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 8, 10 };
		Subarray(a);

	}
}
