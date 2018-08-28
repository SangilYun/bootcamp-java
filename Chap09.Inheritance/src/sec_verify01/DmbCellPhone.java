package sec_verify01;

public class DmbCellPhone extends CellPhone{

	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
		System.out.println("모델 : " + this.model + "\n색상 : " + this.color + "\n채널 : " + this.channel);
	}
	
	void turnonDmb() {
		System.out.println("채널" + this.channel+ "번 DMB 방송 수신을 시작합니다." );
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 "+ this.channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
	
	public static void main(String[] args) {
		DmbCellPhone test = new DmbCellPhone("자바폰","검정",10);
		test.powerOn();
		test.bell();
		test.sendVoice();
		test.receiveVoice();
		test.sendVoice();
		test.hangUp();
		test.turnonDmb();
		test.changeChannelDmb(12);
		test.turnOffDmb();
	}
}
