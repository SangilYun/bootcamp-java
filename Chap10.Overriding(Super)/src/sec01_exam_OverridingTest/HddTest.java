package sec01_exam_OverridingTest;

public class HddTest {
	
	public static void main(String[] args) {
		//인스턴스를 선언 각각의 클래스의 인스턴스 생성
		HddDisk hd = new HddDisk(500,700);
		UsbMemory um = new UsbMemory(32,520);
		
		String strhd = hd.Status();
		
		//부모클래스의 메서드가 호출됨
		System.out.println(strhd);
		
		//오버라이딩한 자손클래스의 메서드가 호출 
		String strum = um.Status();
		System.out.println(strum);
	}
}
