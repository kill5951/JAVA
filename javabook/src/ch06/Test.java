package ch06;

public class Test {

	public static void main(String[] args) {
		
	Book book1 = new Book("ȫ�浿��","���",10000); // ��ü����	
	book1.infoBook();
	
	Book book2 = new Book("��ȭ�ϱ�","������",10000);	
	book2.infoBook();

	Book book3 = new Book("��ȭȫ��","�۰��̻�",10000);
	book3.infoBook();			
	
	Book[] books = new Book[3];
	books[0] = new Book("ȫ�浿��","���",10000);
	//books[0] = book1;	
	books[1] = book2;
	//books[1] = new Book("��ȭ�ϱ�","������",10000);
	books[2] = new Book("java���α׷���","������",10000);			
	
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
