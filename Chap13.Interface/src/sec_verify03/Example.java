package sec_verify03;

public class Example {

	public static void main(String[] args) {
		SmartTelevision sTv = new SmartTelevision();
		sTv.turnOn();
		sTv.setVolume(13);
		sTv.setVolume(-4);
		sTv.setVolume(8);
		sTv.setMute(false);
		sTv.setMute(true);
		sTv.turnOff();
		RemoteControl.changeBatter();
		System.out.println();
		sTv.smartSkill();
		sTv.search("www.naver.com");

	}

}
