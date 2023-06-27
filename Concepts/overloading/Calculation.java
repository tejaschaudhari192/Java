public class Calculation {
	public int add(int a, int b) {
		return a + b;
	}

	public float add(float a, float b) {
		return a + b;
	}

	public String add(String a, String b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Calculation c1 = new Calculation();
		System.out.println(c1.add(5, 5));

		System.out.println(c1.add(1.8f, 3.2f));

		System.out.println(c1.add('3', '3'));

		System.out.println(c1.add("1", "0"));
	}
}
	
