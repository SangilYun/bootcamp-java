package sec03_exam_overloading;

public class OverloadingExample {

	public static void main(String[] args) {
		
		Overloading mm = new Overloading();
		System.out.println("Overloading.add(3,3) 결과 : "+mm.add(3,3));
		System.out.println("Overloading.add(3L,3) 결과 : "+mm.add(3L,3));
		System.out.println("Overloading.add(3,3L) 결과 : "+mm.add(3,3L));
		System.out.println("Overloading.add(3L,3L) 결과 : "+mm.add(3L,3L));
		
		int[] a = new int[] {100,200,300};
		System.out.println("Overloading.add(a) 결과 : "+mm.add(a));
	}

}
