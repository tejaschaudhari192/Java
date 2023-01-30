// package Functions_and_methods;

public class fn_overloading {

	// function overloading on n(parameters)
	public static int sum(int a , int b) {
		System.out.println("fn #1");
		return a+b;
		
	}
	public static int sum(int a , int b,int c) {
		System.out.println("fn #2");
		return a+b+c;
	}

	// function overloading on datatype
	public static float sum(float a , float b) {
		System.out.println("fn #3");
		return a+b;
	}
	public static void main(String[] args) {
		int a= 1,b=2,c=3;
		System.out.println(sum(a, b));
		System.out.println(sum(a, b, c));
		System.out.println(sum(2.4f,1.6f));
	}
}
