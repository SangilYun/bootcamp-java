package sec01_vertify;

public class Exercise01 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z ;
		
		
		z = ++x+y--;
		System.out.println("x를 전위증감하고 y를 후위감소를 한 결과를 z에 대입한 결과 값 : "+z);

	}

}
