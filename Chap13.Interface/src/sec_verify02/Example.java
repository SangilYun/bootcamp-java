package sec_verify02;

public class Example {

	public static void main(String[] args) {
		Television tv = new Television();
		Audio audio = new Audio();
		
		tv.turnOn();
		tv.setVolume(13);
		tv.setVolume(-3);
		tv.setMute(false);
		tv.setMute(true);
		tv.turnOff();
		RemoteControl.changeBatter();
		System.out.println();
		audio.turnOn();
		audio.setVolume(13);
		audio.setVolume(-3);
		audio.setMute(false);
		audio.setMute(true);
		audio.turnOff();
		RemoteControl.changeBatter();
		

	}

}
