package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int max=8;
		int a = 0, b = 1, c;
		System.out.println("Print the fibonacci series");
		System.out.println(a);
		System.out.println(b);
		for (int i=0;i<=max;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
