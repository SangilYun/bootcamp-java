package sec_verify02;

public class Television implements RemoteControl{

	private int volume;
	
	public void setVolume(int volume) {
		if(volume > 10) {
			System.out.println("Television 볼륨의 최대치 값은 10입니다. "
					+ "볼륨을 10으로 지정합니다.");
			this.volume = 10;
		}
		else if(volume <0) {
			System.out.println("Television 볼륨의 최소치 값은 0입니다. "
					+ "볼륨을 0으로 지정합니다.");
			this.volume = 0;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}
	
	public void setMute(boolean mute) {
		RemoteControl.super.setMute(mute);
	}
}
