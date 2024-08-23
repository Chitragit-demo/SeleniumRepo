package week2.day4;

public class APIClient {
	public void sendRequest(int a,int b) {
		System.out.println("Print A: " +a +" and" +" Print B: " +b);
	}
	public void sendRequest(String endpoint,String requestbody,boolean requeststatus) {
		System.out.println("Print endpoint: " +endpoint +" Print requestbody: " +requestbody +" Status:" +requeststatus);
	}
	public void sendRequest(String endpoint) {
		System.out.println("Print endpoint: " +endpoint);
	}
	public static void main(String[] args)
	{
		APIClient API = new APIClient();
		int a = 150;
		int b = 100;
		String servlet = "tomcat";
		String requestbody = "body";
		boolean requeststatus = true;
		API.sendRequest(servlet);
		API.sendRequest(servlet, requestbody, requeststatus);
		API.sendRequest(a,b);
		
	}
}
