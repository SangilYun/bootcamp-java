package sec_verify04_3;

public class Toilet {

	private boolean seat;
	
	public void use() {
		if(seat == false) {
			seat = true;
			System.out.println(Thread.currentThread().getName()+" 의 말 : 시원하다");
			seat = false;
		}
		else
			System.out.println("이미 사용 중");
	}
}
