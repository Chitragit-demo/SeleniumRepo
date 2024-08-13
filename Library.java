package week1.day2;

public class Library {

	public String addBook(String BookTitle)
	{
		System.out.println("Book added successfully!"
				+"" +"\n" +"Book Name is: " +BookTitle);
		return BookTitle;
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully!");
	}
	
	public static void main(String[] args) {
		
		Library ab = new Library();
		ab.addBook("Silent Patient");
		ab.issueBook();
	}
	}
