package sec06_exam_singleton;

public class Singleton {

	//접근제어자의 범위가 가장 좁은 private를 붙여서 외부에서는 new를 통해 인스턴스 생성 불가함.
	//static은 클래스 영역에 올라가니깐, 굳이 외부에서 new연산자를 통해서 생성 안해도 됨.
	private static Singleton singleTon = new Singleton();
	
	//singleton의 기본 생성자임. 역시 private 접근제어자라서 외부에서 접근 못함.
	//컴파일러는 기본 생성자가 없을시에는 , 자동적으로 알아서 기본생성자를 제공해줌.
	private Singleton() {}
	
	//static 메서드인 getInstance는 singleton의 주소를 리턴함.
	public static Singleton getInstance() {
	
		//return this.singleton; //예외 발생함.
		return Singleton.singleTon;
	}
	
}
