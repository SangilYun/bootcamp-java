package sec03_exam_Nested_Outter_Refer;

public class OutterExample {

	public static void main(String[] args) {
		
		Outter outter = new Outter(); //바깥클래스 인스턴스 생성
		Outter.Nested nested = outter.new Nested(); //중첩클래스 인스턴스 생성
		
		nested.print();

	}

}
