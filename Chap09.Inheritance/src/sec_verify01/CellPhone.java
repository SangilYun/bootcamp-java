package sec_verify01;

public class CellPhone {

	String model;
	String color;
	int count =0;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice() {
		if(count ==0) {
			System.out.println("자기 : 여보세요");
			count ++;
		}
		else {
			System.out.println("자기 : 아 ~ 예 반갑습니다.");
			count =0;
		}
	}
	
	void receiveVoice() {
			System.out.println("상대방 : 안녕하세요! 저는 홍길동");
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
