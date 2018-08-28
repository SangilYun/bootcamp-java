package sec01_exam_captionTv;

public class CaptionTvExample {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;	//조상 클래스로부터 상속받은 맴버
		ctv.channelUp();	//조상 클래스로부터 상속받은 맴버, channel을 1증가시킴.
		
		System.out.println("현재 채널은 " + ctv.channel + "입니다.");
		ctv.displayCaption("캡션기능 출력 메시지 : Hello, World"); //false이므로 출력 안됨.
		
		ctv.caption = true;	//캡션긴능을 켠다.
		ctv.displayCaption("캡션기능 출력 메시지 : Hello, world"); //캡션 화면에 보여준다.
	}

}
