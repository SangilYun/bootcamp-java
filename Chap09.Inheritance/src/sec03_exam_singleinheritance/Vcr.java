package sec03_exam_singleinheritance;

public class Vcr {
	
	boolean power;
	int counter = 0;
	
	public Vcr() {
		super(); //object생성자 호출 
		System.out.println("Vcr생성자 호출");
	}
	
	public void power() {
		power = !power;
		System.out.println("Vcr의 power메서드를 호출하였습니다.");
	}
	
	public void play() {
		System.out.println("Vcr의 play메서드를 호출하였습니다.");
	}
	
	public void stop() {
		System.out.println("Vcr의 stop메서드를 호출하였습니다.");
	}
	
	//되감기 <<
	public void rew() {
		System.out.println("Vcr의 rew메서드를 호출하였습니다.");
	}
	
	//빨리감기 >>
	public void ff() {
		System.out.println("Vcr의 ff메서드를 호출하였습니다.");
	}
}
