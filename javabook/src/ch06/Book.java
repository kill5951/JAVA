package ch06;

public class Book {
	private String title;
	private String author;
	private int price;
	
//	Book(String t, String a, int p){
//		title = t;
//		author = a;
//		price = p;
//	}
//	
//	String getTitle(){
//		return title;
//	}
//	String getAuthor(){
//		return author;
//	}
//	int getPrice(){
//		return price;
//	}
//	
//	void setTitle(){
//		this.title = title;
//	}
//	
//	void setAuthor(){
//		this.author = author;
//	}
//	
//	
//	void setPrice(int price){
//		this.price = price;
//	}
	
	void infoBook(){
		System.out.println("제목: "+title);
		System.out.println("저자: "+author);
		System.out.println("가격: "+price);		

	}

public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

public Book(String title, String author, int price) {
	
	this.title = title;
	this.author = author;
	this.price = price;
}
}
