public class type_promotion
{
	public static void main(String[] args) 
	{
		byte a=1;
		short b =2;
		int c=3;
		long d = 34;
		float e = 3.5f;
		double f = 3.4f;

		double z = a+b+c+d+e+f;
		System.out.println(z);

		//typecast
		float val = (int)(a+b+c+d+e+f);
		System.out.println(val);

	}
}
