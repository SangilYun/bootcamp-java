package sec09_verify;

public class ConversationBook extends Book{

	private String langauge;
	
	public ConversationBook(int productID, String description, String maker,
			int price, int ISBN, String title, String author, String language) {
		super(productID, description, maker, price, ISBN, title, author);
		this.langauge = language;
		}

	public String getLangauge() {
		return langauge;
	}

	public void setLangauge(String langauge) {
		this.langauge = langauge;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("언어 : " + this.langauge);
	}
}
