package sec01_exam;

public class TvTestExample1 {

	public static void main(String[] args) {
		
		Tv t;
		t = new Tv();
		t.channel =7;
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel + "입니다.");
	}

}
