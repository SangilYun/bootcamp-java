package sec01_exam_captionTv;

public class Tv {
	
	boolean power; 	//전원상태(on/off)
	int channel;	//채널
	
	public Tv() {
		System.out.println("조상클래스 생성자 호출");
	}
	
	//전원기능 
	public void power() {
		this.power = !power;
	}
	
	//채널 업 다운 기능 
	public void channelUp() {
		++this.channel;
	}
	
	public void channelDown() {
		--this.channel;
	}

}
