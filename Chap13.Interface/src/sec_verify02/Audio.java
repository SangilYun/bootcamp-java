package sec_verify02;

public class Audio implements RemoteControl{

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > 10) {
			System.out.println("Audio 볼륨의 최대치 값은 10입니다. "
					+ "볼륨을 10으로 지정합니다.");
			this.volume = 10;
			System.out.println("현재 Audio 볼륨 : " + this.volume);
		}
		else if(volume <0) {
			System.out.println("Audio 볼륨의 최소치 값은 0입니다. "
					+ "볼륨을 0으로 지정합니다.");
			this.volume = 0;
			System.out.println("현재 Audio 볼륨 : " + this.volume);
		}
	}
	
	public void setMute(boolean mute) {
		RemoteControl.super.setMute(mute);
	}
}
