package sec01_exam;

public class Tv {
	String color;
	boolean power;
	int channel;
	
	public void power() {
		this.power =!this.power;
	}
	public void channelUp() {
		++this.channel;
	}
	public void channelDown() {
		if(this.channel<0) {
			System.out.println("채널은 음수값이 없습니다");
		}
		--this.channel;
	}
}
