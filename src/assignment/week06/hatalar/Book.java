package assignment.week06.hatalar;

public class Book {
	String title;
	
	Book(String title) {
		this.title = title;
	}
	
	public static void main(String[] args) {
		Book myBook = new Book("title");
		System.out.println(myBook.title);
	}
}