package assignment.week06.hatalar;
/*
*Hatalı kod
public clas Book {
    private String title;
    pulic Book(String title) {
        title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public static void main(String[] args) {
        Book book = new Book("Java Temeller");
        System.out.println(book.getTitle());
    }
}
* */
public class Quest03 {
	public class Book {
		private String title;
		public Book(String title) {
			this.title = title;
		}
		
		public String getTitle() {
			return title;
		}
		
		public void main(String[] args) {
			Book book = new Book("Java Temeller");
			System.out.println(book.getTitle());
		}
	}
}