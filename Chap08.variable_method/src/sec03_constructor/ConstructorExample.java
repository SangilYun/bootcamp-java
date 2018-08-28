package sec03_constructor;

public class ConstructorExample {

	public static void main(String[] args) {
		
		Data1 d1 = new Data1();	//기본 생성자를 호추
//		Data2 d2 = new Data2();	//exception발생 ? 이유?
		
		d1.value = 10;
		System.out.println(d1.value);
		
		Data2 d3 = new Data2(3);
		System.out.println(d3.value);

	}

}
