package sec_verify01;

public class China extends Asia {

	String country;
	
	@Override
	public String toString() {
		this.country = "china";
		return "내가 살고있는 나라 : " + this.country +"이며, 내 나라는 " + super.country+ "에 속합니다.";
	}
}
