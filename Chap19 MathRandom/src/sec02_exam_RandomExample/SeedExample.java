package sec02_exam_RandomExample;

import java.util.Random;

public class SeedExample {

	public static void main(String[] args) {

		//Math.random()과 Random클래스의 가장 큰차이점은 종자값(seed)을 
		//설정할 수 있는 것에서 차이가 있다.
		//Random에서 종자값을 설정하면, 항상 같은 난수를 같은 순서대로 반환한다는 것.
		//public Random(){ this(System.currentTimeMillis()); }의 생성자 호출
		Random rand1 = new Random();
		Random rand2 = new Random(1);
		Random rand3 = new Random(2);
		
		System.out.println("= rand1(항상 다른값 반환) = ");
		
		for(int i=0; i<5; i++) {
			int num = Math.abs(rand1.nextInt()%10)+1;
			System.out.println(num);
		}
		
		System.out.println();
		//rand2는 항상 같은 값의 난수만 반환한다.
		System.out.println(" = rand2(항상 같은 값 반환) = ");
		
		for(int i=0; i<5; i++) {
		 System.out.println(i + " : " + rand2.nextInt()%10);
		}
		System.out.println(" = rand3(항상 같은 값 반환) = ");

		for(int i=0; i<5; i++) {
			System.out.println(i + " : " + rand3.nextInt()%10 );
		}
	}
}
