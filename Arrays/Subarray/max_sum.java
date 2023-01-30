public class max_sum {
	public static int max_sub(int arr[]) {
		int max = Integer.MIN_VALUE, sum = 0;
		int prefix[]= new int[arr.length]; // ?
		prefix[0]=arr[0];
		for (int i = 1; i < prefix.length; i++) {
			prefix[i]= prefix[i-1]+arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
			// sum = 0;
			// for (int k = i; k <= j; k++) {
			// 		sum += arr[k];
			// 		System.out.print(arr[k] + ",");
			// 	}
				sum = i==0?prefix[j]:prefix[j]+ prefix[i-1];
			System.out.println();
				if (sum > max)
					max = sum;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = { -1, 3, -2, 4 };
		System.out.println("\nMax sum : " + max_sub(arr));
	}
}
