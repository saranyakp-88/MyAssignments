package week1.day2hw;

public class Library {
	
	public String addBook(String bookTitle) {
		
		System.out.println("Book added successfully");
		return bookTitle;
		
		}
	protected void issueBook() {
		System.out.println("Book Issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lb = new Library();
		String name = lb.addBook("Harry Potter");
		System.out.println("The book is :"+name);
		lb.issueBook();		
	}

}
