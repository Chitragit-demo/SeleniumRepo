package week1.day3;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		 String test = "changeme";
		 char[] charArray = test.toCharArray();
		 for (int i = 0; i <= charArray.length-1; i++) {
			 if ( i % 2 == 1) {
				System.out.print(Character.toUpperCase(charArray[i]));
			}
			 else
				System.out.print(charArray[i]);
			}	
	}

}
