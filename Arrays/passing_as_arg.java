//call by reference
public class passing_as_arg {
	public static void update(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 5;
		}
	}

	public static void main(String[] args) {
		int marks[] = { 78, 83, 92 };

		update(marks);

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}
}
