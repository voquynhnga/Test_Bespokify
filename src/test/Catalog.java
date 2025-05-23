package test;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

	static Book[] catalog =new Book[1000];
 
	
	public static void addBook(int ISBN, String title, String author, String genre, int quantity) {
		if(catalog[ISBN] != null) {
			Book book = catalog[ISBN];
			book.quantity++;
		}
		if(ISBN < 1000 && ISBN >= 0) {
		catalog[ISBN] = new Book(ISBN, title, author,genre, quantity);
		}
		else {
			System.out.println("Please enter ISBN is a number and less than 1000 and greater than 0");
		}
		
	}
	
	
	public static void removeBook(int ISBN) {
		for (Book book: catalog) {
			if(book.getISBN() == ISBN) {
				catalog[ISBN] = null;
			}
		}
	}
	
	public static void removeBook(Book[] books) {
		List<Integer> listRemove = new ArrayList<Integer>();	
		for(Book book : books) {
			listRemove.add(book.getISBN());
		}
		for (int i: listRemove) {
			catalog[i] = null;

		}
		
	}
	
	public static String findBookByID(int ISBN) {
		Book book = catalog[ISBN];
		if (book == null) return ("This ISBN is invalid");
		else return book.getBook();
	}
	
	public static void listAllBook() {
		for (Book book : catalog) {
			book.getBook();
		}
	}
	
	public int findBookByGenre(String genre) {
		for (Book book : catalog) {
			if(book.genre == genre.toLowerCase()) {
				return book.ISBN;
			}
		}
		return -1;
		
	}
	
	

}
