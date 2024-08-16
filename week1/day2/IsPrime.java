package week1.day2;

public class IsPrime {
public static void main(String[] args) {
	int maxInput=10;
	for (int i=2;i<=maxInput;i++)
	{
		if(i%2==0)
		{
			System.out.println("The number is not Prime: " +i);
		}
		else
			System.out.println("The number is Prime: "+i);
	}
	//Need to dig more to get a correct solution
}
}
