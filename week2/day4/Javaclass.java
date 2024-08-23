package week2.day4;

public class Javaclass {
	public void reportStep(String message, String status) {
		System.out.println("Message: " +message +";" +" Status: " +status);
	}
	public void reportStep(String message, String status, boolean requeststatus ) {
		System.out.println("Message: " +message +";" +" Status: " +status +";" +" Request Status: " +requeststatus);
	}
	public static void main (String[] args)
	{
		Javaclass JC = new Javaclass();
		String message = "hello is displayed";
		String Status = "in-scope";
		boolean requeststatus = true;
		JC.reportStep(message, Status);
		JC.reportStep(message, Status, requeststatus);
	}
}
