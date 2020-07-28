package ch06;

public class Test {

	public static void main(String[] args) {
		
	Book book1 = new Book("홍길동전","허균",10000); // 객체생성	
	book1.infoBook();
	
	Book book2 = new Book("열화일기","박지원",10000);	
	book2.infoBook();

	Book book3 = new Book("장화홍련","작가미상",10000);
	book3.infoBook();			
	
	Book[] books = new Book[3];
	books[0] = new Book("홍길동전","허균",10000);
	//books[0] = book1;	
	books[1] = book2;
	//books[1] = new Book("열화일기","박지원",10000);
	books[2] = new Book("java프로그래밍","조용준",10000);			
	
	for(int i=0;i<books.length;i++){
		books[i].infoBook();
		System.out.println(book1.getTitle() );
		book1.setPrice(20000);
	}
	
	for(Book b:books){
		b.infoBook();
	}
	}	
}
