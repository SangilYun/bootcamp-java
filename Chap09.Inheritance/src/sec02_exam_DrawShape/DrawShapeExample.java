package sec02_exam_DrawShape;

public class DrawShapeExample {

	public static void main(String[] args) {
		
		Point[] p = new Point[] {
				new Point(100,100),
				new Point(140,50),
				new Point(200,100)
				};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150), 50);
		Circle c1 = new Circle();
		
		t.color = "노랑";
		c.color = "파랑";
		c1.color = "녹색";
		System.out.println("삼각형의 각 점(좌표)들과 색상을 나타냄");
		t.draw();
		
		System.out.println("원의 원점과 반지름, 색상을 나타냄");
		c.draw();
		c1.draw();
	}

}
