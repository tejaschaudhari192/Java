
public class subarray{

	public static void Subarray(int arr[]){
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int j2 = i; j2 < j; j2++) {
					System.out.print(arr[j2]);
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int a[] ={2,4,6,8,10};
		Subarray(a);

	}
}