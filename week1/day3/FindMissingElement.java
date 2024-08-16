package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] a = {1, 4,3,2,8, 6, 7}; 
		int[] b = {1,2,3,4,5,6,7,8};
		Arrays.sort(a);
		int n = b.length ;
		int expectedsum = n * (n+1) / 2;
		int actualsum = 0;
		for (int i=0 ; i <= a.length-1 ; i++)
		{
			actualsum = a[i] + actualsum;
			
		}
		if (expectedsum != actualsum)
		{
			int missingnum = (expectedsum - actualsum);
			System.out.println("Print missing number: " +missingnum);
		}
	}

}
