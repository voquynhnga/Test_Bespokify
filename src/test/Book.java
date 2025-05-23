package test;

public class Book {
	int ISBN;
	String title,author, genre;
	static int  quantity = 0;
	public Book(int ISBN, String title, String author, String genre, int quantity) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.quantity = quantity;
	
	}
	public int getISBN() {
		return this.ISBN;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	
	public String getGenre() {
		return this.genre;
		
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public String getBook() {
		String in4 = this.ISBN + this.title + this.author + this.genre + this.quantity;
		return in4;
	}



}
