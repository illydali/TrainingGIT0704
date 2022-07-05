// create class
public class Book {
//	The default visibility is known as “package-private” 
//	(though you can't use this explicitly), 
//	which means the field will be accessible from inside 
//	the same package to which the class belongs.
//	fields
	static String site = "Amazon"; //null
	String iSBN; // null
	String title; // null
	String author; // null
	short noOfPages; // 0
	boolean available; // false
	final String  SELLER_AGENT = " Shroff Publishers & Distributors Pvt. Ltd";
// methods
	void getDetails() {
		System.err.println(iSBN);
		System.err.println(author);
		System.err.println(noOfPages);
		System.err.println(available);
	}
	
	static void getSite() {
		System.err.println(site);
	}
}
