package sec02_exam_DrawShape;

public class Triangle extends Shape {
	
	//점이 3개가 있어야 비로소 삼각형이 완성되므로 , Point를 배열로 선언했다.
	Point[] p = null;
	
	//생성자
	public Triangle(Point[] p) {
		super();
		this.p = p;
	}
	//오버라이딩
	@Override
	public void draw() {
		System.out.printf("[p1 = %s, p2=%s, p3=%s, color = %s]%n", 
				this.p[0].getXY(), this.p[1].getXY(), this.p[2].getXY(), this.color);
	}

	public static void main(String[] args) {
//		Point point1 = new Point();
//		Point point2 = new Point();
//		Triangle test = new Triangle();
//		test.draw();
	}
}
