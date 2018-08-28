package sec_verify01;

public class Bird {
	String type;
	boolean flightYN;

	boolean getFlight() {
		return this.flightYN;
	}
	
	void move() {
		this.type = "앵무새";
		this.flightYN = true;
		String str = "새의 종류는 " + this.type + "이고 ";
		if(this.getFlight()) {
			str += "날 수 있습니다.";
		}
		else {
			str+="날 수 없습니다.";
		}
		System.out.println(str);
	}
}
