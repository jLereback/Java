package se.iths.before.refvaltypes2;

public class RefValTypes2 {

	public static void main(String[] args) {
		
		Book b = new Book();
		b.setAuthor("J.K. Rowling");
		b.setTitle("Harry Potter");
		b.setYear(1999);
		
		Book b2 = b;
		

		System.out.println(b.getAuthor());
		bookChanger(b);
		System.out.println(b2.getAuthor());
	}
	
	public static void bookChanger(Book b) {
		b.setAuthor("J.D. Salinger");
	}

}
