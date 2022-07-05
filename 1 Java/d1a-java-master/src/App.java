// IP : 
public class App {
	public static void main(String[] args) {
		// access static method
		Book.getSite();
//		create object
		Book javaBook;
		// create memory (instance)
		javaBook = new Book();
		
		// assign the values
		javaBook.iSBN = "0134685997";
		javaBook.title = "Effective Java";
		javaBook.author = "Joshua Bloch ";
		javaBook.noOfPages = 416 ;
		javaBook.available = true;
		
		//get details
		javaBook.getDetails();
		javaBook.site = "AmazonSG";
		Book.site = "AmazonSG";
		System.err.println(Book.site);
		System.err.println(javaBook.site);
		
		System.err.println(javaBook.SELLER_AGENT);
		
		System.err.println("*************");
//		second book
		Book classicFictionBook = new Book();
		classicFictionBook.iSBN = "1844132390";
		System.err.println(Book.site);
		System.err.println(classicFictionBook.site);
//		other fields
		
		classicFictionBook.getDetails();
	}
}
