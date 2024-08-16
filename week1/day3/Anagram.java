package week1.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "madam";
		String s2 = "madam";
		if (s1.length() == s2.length())
		{
			char[] charArray = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
		
			boolean result = Arrays.equals(charArray, charArray2);
				if (result)
				System.out.println("The given strings are Anagram");
				else
				System.out.println("The given strings are not an Anagram");
				}
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		
	}

}
