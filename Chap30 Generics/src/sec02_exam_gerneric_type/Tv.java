package sec02_exam_gerneric_type;


//제네릭 타입 설계 
public class Tv<T> {

	//아래 T는 개발시 사용자가 구체적 타입을 결정하면 
	//그 타입으로 모두 변경됨을 잊지말자.
	
	private T t;
	public T getT() {
		return this.t;
	}
	
	public void setT(T t) {
		this.t= t;
	}
}
