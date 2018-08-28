package sec_verify06;


public class MyVectorExample {

	public static void main(String[] args) {
		MyVector v = new MyVector();
		v.add("2000");
		v.add("15");
		v.add("-20");
		v.add("993");
		v.add("4000");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");
//		v.add("6");
//		v.add("2000");
//		v.add("15");
//		v.add("-20");
//		v.add("993");
//		v.add("4000");
//		v.add("1");
//		v.add("2");
//		v.add("3");
//		v.add("4");
//		v.add("5");
//		v.add("6");
		System.out.println("1번 인덱스 값 : " + v.get(1));
		System.out.println("삭제 전 : " + v.toString());
		System.out.println("객체 수 : " + v.size());
		System.out.println("용량 : " + v.capacity());

		System.out.println();
		v.remove("2000");
		v.remove("993");		
		System.out.println("삭제 후 : " + v.toString());
		System.out.println("객체 수 : " + v.size());
		System.out.println("용량 : " + v.capacity());

		v.clear();
		System.out.println();
		System.out.println("전체 삭제 후 : " + v.toString());
		System.out.println("객체 수 : " + v.size());
		System.out.println("용량 : " + v.capacity());
		System.out.println();
		
		v.add(100);
		v.add("5");
		v.add("6");
		System.out.println("변경 전 : " + v.toString());
		System.out.println("객체 수 : " + v.size());
		System.out.println("용량 : " + v.capacity());
	}
}
