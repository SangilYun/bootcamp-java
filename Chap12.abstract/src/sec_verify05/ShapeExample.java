package sec_verify05;

public class ShapeExample {

	static int i;
	Shape[] arr = {new Circle(5.0), new Rect(3,4), new Circle(1)};
	static double sumArea(Shape[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof Circle) {
				System.out.print("Circle면적의 합 : " + arr[i].calcArea()+"\n");
			}
			else {
				System.out.print("Rect면적의 합 : " + arr[i].calcArea()+"\n");
			}
			sum += arr[i].calcArea();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ShapeExample test = new ShapeExample();
		System.out.println("total sum : " + sumArea(test.arr));

	}

}
