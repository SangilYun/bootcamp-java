package sec04_verify;

public class Document {

	static int count=0;
	String name;

	Document(){
		this.name = "제목없음"+count;
		count++;
		System.out.println("문서 "+this.name+"가 생성되었습니다.");
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서 "+this.name+"가 생성되었습니다.");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Document test1 = new Document();
		Document test2 = new Document("자바.txt");
		Document test3 = new Document();
		Document test4 = new Document();
	
	}

}
