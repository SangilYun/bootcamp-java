package sec01_exam;

public class TvTestExample2 {

	public static void main(String[] args) {
		
		//new라는 연산자가 오면 아무 이유 없이 힙에다가 클래스의 크기 만큼 메모리를 할당한다.
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel+ "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel+" 입니다.");
		
		//System.out.println("t1의 주소 : "+t1.toString());
		//System.out.println("t2의 주소 : "+t2.toString());
		
		t2 = t1; //t2의 주소값 변경함.(즉 같은 인스턴스를 가르키고 있다.)

		//System.out.println("t1의 주소 : "+t1.toString());
		//System.out.println("t2의 주소 : "+t2.toString());
		
		//channel 값을 7으로 한다.
		t2.channel = 7;
		System.out.println("t1의 channle값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel+ "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel+" 입니다.");
	}

}
