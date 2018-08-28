package sec04_verify;

public class KoreanExample {

	String nation;
	String name;
	int height;
	int age;
	String character;
	
	KoreanExample(String nation, String name, int height, int age, String character){
		this.nation = nation;
		this.name = name;
		this.height = height;
		this.age = age;
		this.character = character;
		
		System.out.println("국적 :"+this.nation+"\n이름 : "+this.name+
				"\n키 : "+this.height+"\n나이 : "+this.age+"\n특징 : "+this.character+"\n");	
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		KoreanExample test1 = new KoreanExample("대한민국","김용범",178,26,"대구사투리");

		@SuppressWarnings("unused")
		KoreanExample test2 = new KoreanExample("USA","유재웅",172,29,"어설픈 영어");
	}

}
