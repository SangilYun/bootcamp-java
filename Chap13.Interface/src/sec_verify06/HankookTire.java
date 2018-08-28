package sec_verify06;

public class HankookTire implements Tire{

	static int i=1;;
	
	@Override
	public void roll() {
		System.out.println(i+"번째 한국 타이어가 굴러갑니다.");
		i++;
	}

}
