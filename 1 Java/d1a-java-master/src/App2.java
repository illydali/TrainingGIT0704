// IP : 
public class App2 {
	public static void main(String[] args) {
//		create object
		Book2 javaBook;
		// create memory (instance)
		javaBook = new Book2();
		
		// assign the values
		javaBook.iSBN = "0134685997";
		javaBook.title = "Effective Java";
		javaBook.author = "Joshua Bloch ";
		javaBook.noOfPages = 416 ;
		javaBook.available = true;
		
		//get details
		javaBook.getDetails();
	}
}

//create class
class Book2 {
//	The default visibility is known as “package-private” 
//	(though you can't use this explicitly), 
//	which means the field will be accessible from inside 
//	the same package to which the class belongs.
//	fields
	String iSBN;
	String title;
	String author;
	short noOfPages;
	boolean available;
//methods
	void getDetails() {
		System.err.println(iSBN);
		System.err.println(author);
		System.err.println(noOfPages);
		System.err.println(available);
	}
}
