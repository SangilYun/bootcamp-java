package sec_verify02;

public class MonitorExample {

	public static void main(String[] args) {
		Monitor m1 = new Monitor("UDEA", 19, 210000);
		Monitor m2 = new Monitor("FLATRON", 22, 250000);
		Monitor m3 = new Monitor("UDEA", 19, 210000);
		Monitor m4 = new Monitor("SAMSUNG", 25, 310000);

		if(m1.hashCode() != m2.hashCode()) {
			System.out.println("m1과 m2는 다른 모니터 입니다.");
		}
		if(m1.hashCode() == m3.hashCode()) {
			System.out.println("m1과 m3는 같은 모니터 입니다.");
		}
		if(m1.hashCode() != m4.hashCode()) {
			System.out.println("m1과 m4는 다른 모니터 입니다.");
		}
	}
}
