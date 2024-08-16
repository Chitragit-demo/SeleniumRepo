package week1.day3;

public class RemoveDuplicateStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In-progress - Yet to find the solution
		String text = "We learn Java basics as part of java sessions in java week1";
	//	char[] charArray = text.toCharArray();
		String[] split = text.split(" ");
		int count = 0;
		for(int i=0;i<split.length;i++)
		
			for(int j=1;j<split.length;j++)h
			{
				int j = i+1;
				if(split[i] == split[j])
				{
					System.out.print(split[i]);
				}
			}
		}
	}

}
