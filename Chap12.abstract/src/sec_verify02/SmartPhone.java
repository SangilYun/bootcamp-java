package sec_verify02;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	} 
	@Override
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	public void internetSearch() {
		System.out.println("네이버를 검색합니다.");
	}
	
	public static void main(String args[]) {
		SmartPhone test = new SmartPhone("김지훈");
		System.out.println(test.getOwner());
		test.turnOn();
		test.internetSearch();
		test.turnOff();
		
	}
}
