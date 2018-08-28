package sec02_verify;

public class MyTvTest {
	
	boolean isPowerOn;
	int channel;
	int volume;
	int prevChannel;
	int prevVolume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void setVolume(int volume) {
		if(volume>MAX_VOLUME || volume<=MIN_VOLUME ) {
			System.out.println("볼륨이 100을 넘거나, 0이거나, 음수일 수는 없다.");
		}
		else {
			this.prevVolume = this.volume;
			this.volume = volume;
		}
	}
	void setChannel(int channel) {
		if(channel> MAX_CHANNEL || channel<=MIN_CHANNEL ) {
			System.out.println("채널이 100을 넘거나, 0이거나, 음수일 수는 없다.");
		}
		else {
			this.prevChannel = this.channel;
			this.channel = channel;
		}
	}
	int getVolume() {
		return this.volume;
	}
	int getChannel() {
		return this.channel;
	}
	void getoPrevChannnel() {
		this.channel = this.prevChannel;
	}
	void getoPrevVolume() {
		this.volume = this.prevVolume;
	}

	public static void main(String[] args) {
		MyTvTest test = new MyTvTest();
		test.setChannel(1000);
		test.setChannel(8);
		test.setChannel(15);
		System.out.println("현재 CH: "+test.getChannel());
		System.out.println("이전 CH: "+test.prevChannel);
		
		test.setVolume(1000);
		test.setVolume(20);
		test.setVolume(25);
		System.out.println("현재 VOL: "+test.getVolume());
		System.out.println("이전 VOL: "+ test.prevVolume);
	}

}
