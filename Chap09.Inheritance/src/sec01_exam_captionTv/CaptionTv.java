package sec01_exam_captionTv;

public class CaptionTv extends Tv {
	
	boolean caption;
	
	public CaptionTv() {
		super();	//조상클래스의 생성자를 호출하는 매서드(컴파일러가 알아서 호출)
		System.out.println("자손클래스 생성자 호출");
	}
	
	public void displayCaption(String text) {
		//1번째 호출시에 false, 두번째 호출시에는 true
		//캡션 상태가 on(true)일 때만 text를 보여 준다.
		if(this.caption)
			System.out.println(text);
	}
}

