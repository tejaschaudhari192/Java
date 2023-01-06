import java.util.Scanner;

public class area_of_circle {
	public static void main(String[] args) {
		System.err.print("enter radius : ");
		Scanner scan = new Scanner(System.in);
		float r = scan.nextFloat();
		float pi = 3.14f;
		float area = r * r * pi;
		System.out.println(area);

	}

}
