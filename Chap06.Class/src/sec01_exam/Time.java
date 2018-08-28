package sec01_exam;

public class Time {

	private int hour;
	private int minute;
	private float second;
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public float getSecond() {
		return this.second;
	}
	
	public void setHour(int h) {
		if(h<0||h>23) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;
		}
		this.hour = h;
	}
	public void setMinute(int m) {
		if(m<0||m>59) {
			System.out.println("분을 잘못 입력하셨습니다.");
			return;
		}
		this.minute = m;
	}
	
	public void setSecond(int s) {
		if(s<0||s>59) {
			System.out.println("초를 잘못 입력하셨습니다.");
			return;
		}
		this.second = s;
	}
	@Override
	public String toString() {
		String str = this.getHour() + ":" + this.getMinute() + ":" +
				this.getSecond()+"초입니다.";
		return str;
	}
}
