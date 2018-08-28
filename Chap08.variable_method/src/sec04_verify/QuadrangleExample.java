package sec04_verify;

public class QuadrangleExample {

	double areaRectangle(double side) {
		
		return side*side;
	}
	
	double areaRectangle(double side1, double side2) {
		return side1 *side2;
	}
	
	static void test() {
		QuadrangleExample test = new QuadrangleExample();
		System.out.println(test.areaRectangle(10));
		System.out.println(test.areaRectangle(10,20));
	}
	
	public static void main(String[] args) {
		QuadrangleExample.test();
	}

}
