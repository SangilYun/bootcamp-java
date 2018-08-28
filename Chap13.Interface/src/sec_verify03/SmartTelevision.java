package sec_verify03;

public class SmartTelevision implements RemoteControl, Searchable{

	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url + " 을 검색합니다.");
		
	}

	@Override
	public void smartSkill() {
		System.out.println("Smart기능을 시작합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > 10) {
			System.out.println("스마트TV 볼륨의 최대치 값은 10입니다. "
					+ "볼륨을 10으로 지정합니다.");
			this.volume = 10;
		}
		else if(volume <0) {
			System.out.println("스마트TV 볼륨의 최소치 값은 0입니다. "
					+ "볼륨을 0으로 지정합니다.");
			this.volume = 0;
		}
		else {
		this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
	public void setMute(boolean mute) {
		RemoteControl.super.setMute(mute);
	}

}
