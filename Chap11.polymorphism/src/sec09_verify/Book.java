package sec09_verify;

public class Book extends Product{

	private int ISBN;
	private String title;
	private String author;
	
	public Book(int productID, String description, String maker,
			int price, int ISBN, String title, String author) {
		super(productID, description, maker, price);
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("국제표준도서번호 : " + this.ISBN);
		System.out.println("책제목 : " + this.title);
		System.out.println("저자 : " + this.author);
	}
}
