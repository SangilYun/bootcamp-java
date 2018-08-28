package sec_verify01;

public class Korea extends Asia{

	String country;
	
	@Override
	public String toString() {
		this.country = "korea";
		return "내가 살고있는 나라 : " + this.country +"이며, 내 나라는 " + super.country+ "에 속합니다.";
	}
	
	public static void main(String[] args) {
		China china = new China();
		Korea korea = new Korea();
		
		System.out.println(china);
		System.out.println(korea);
	}
}
