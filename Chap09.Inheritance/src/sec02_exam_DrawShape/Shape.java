package sec02_exam_DrawShape;


//조상 클래스(부모클래스) 맴버변수 2개
public class Shape {

	String color = "black";
	
	//기본 생성자(없으면 컴파일러가 알아서 추가해준다)
	public Shape() {}
	
	public void draw() {
		System.out.printf("[color = %s] %n]",color);
	}
}
