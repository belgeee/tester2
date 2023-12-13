package lab9;
public class LibraryRecord {
	public LibraryRecord(String title, String author, int num, String publisher, int year, boolean circu ){
		bookTitle = title;
		bookAuthor = author;
		catalogNumber = num;
		publisherName = publisher;
		publicationYear = year;
		circulating = circu;
	}
	// ene dotor bolhooroo variatsiin huvisagchid utga onoohig zarlaj bn 
	public LibraryRecord(String title, String author, int num, String publisher, int year ){
		bookTitle = title;
		bookAuthor = author;
		catalogNumber = num;
		publisherName = publisher;
		publicationYear = year;
	} 
	public String getBookTitle(){
		return bookTitle;
	}
	public String getBookAuthor(){
		return bookAuthor;
	}
	public int getCatalogNumber(){
		return catalogNumber;
	}
	public String getPublisherName(){
		return publisherName;
	}
	public int getPublicationYear(){
		return publicationYear;
	}
	public void setCirculating(boolean flag){
		circulating = flag;
	}
	public boolean isCirculating(){
		return circulating;
	}
	
	public String toString(){
		return "Book title : \"" + bookTitle+ "\"" + "\n" + "Written by: " + 
				bookAuthor + "\n" + "The Library of catalog number: " + catalogNumber + "\n" +  
				"Published at: " + publisherName + "\n" + "Publication year: " + 
				publicationYear + "\n" + "Circulating: " + isCirculating();
	}
	
	private String bookTitle;
	private String bookAuthor;
	private int catalogNumber;
	private String publisherName;
	private int publicationYear;
	private boolean circulating;
}