package week1.day2hw;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library newObject = new Library();
				String bookName = newObject.addBook("Roald Dahl books");
				System.out.println("NEw book added:"+bookName);
				newObject.issueBook();
				

	}

}
