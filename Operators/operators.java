public class operators {
	public static void main(String[] args) {
		// arithmetic
		int a = 9;
		int b = 1;
		System.out.println("addition : " + (a + b) + "\nsubtraction : " + (a - b));

		System.out.println("\n");
		// unary
		b = a++;
		System.out.println(b);
		System.out.println(a);

		System.out.println("\n");
		// logical
		System.out.println((a < b) || (a != b));
		System.out.println(a > b);
		System.out.println(!(a > b));

		System.out.println("\n");
		// assignment
		int as = 0, bs = 2;
		as += bs;// similarly -=  *=  /=
		System.out.println(as);
	}
}
