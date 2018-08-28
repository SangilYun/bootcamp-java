package sec02_exam_DrawShape;

public class Circle extends Shape {

	Point center = null; //포함관계 composite
	int r ;
	
	//Circle(Point center, int r)를 호출
	public Circle() {
		//this(Point클래스의 인스턴스 주소값, 100)을 가지는 생성자를 호출
		this(new Point(0,0), 100);
		//this(center,100);
	}
	
	//center는 Point의 참조변수(주소값), r= 100
	public Circle(Point center, int r) {
		super();				//조상클래스의 생성자를 호출함--> 없어도 컴파일러가 생성해줌.
		this.center = center;	// 0,0
		this.r = r;				// 100
	}
	//조상클래스의 맴버메서드인 draw()를 오버라이딩(재정의) 함
	//원을 그리는 대신에 원의 정보를 출력하도록 한다.
	//(오버라이딩 : 선언부가 무조건 같고, 구현부만 다르게 구현함)
	@Override
	public void draw() {
		System.out.printf("[center(원점) = (%d, %d), r(반지름) = %d, color(색깔) = %s]%n",this.center.x, this.center.y,this.r,this.color);
	}
	
	public static void main(String[] args) {
		Circle test = new Circle();
		test.draw();
	}
}
