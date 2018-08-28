package sec03_exam_singleinheritance;

public class TVCRExample {

	public static void main(String[] args) {
		
		TVCR tvcr = new TVCR();  //자손클래스의 대한 인스턴스 생성한 것
		Tv tv = new Tv();		 //조상클래스의 대한 인스턴스 생성한 것
		
		tv.power();
		
		//오버라이딩(재정의)한 자손클래스의 power()가 호출됨.
		tvcr.power();
		
		System.out.println(tvcr.getChannel());
		System.out.println(tvcr.channel);
		
		tvcr.vcr.play(); //이런 방법은 쓰지않도록 한다.
		tvcr.play();
		tvcr.stop();
		tvcr.rew();
		tvcr.ff();
		tvcr.channelUp();
		tvcr.channelDown();
	}

}
