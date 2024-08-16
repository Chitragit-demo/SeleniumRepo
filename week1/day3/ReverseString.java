package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
					
				String name="Chitra";
				char[] conChar = name.toCharArray();
				System.out.print("Print the given name, [" +name +"] in reverse: ");
				for (int i = conChar.length-1; i >=0; i--) {
					System.out.print(conChar[i]);
				}
		}

}
