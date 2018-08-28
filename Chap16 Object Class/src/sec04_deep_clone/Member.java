package sec04_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable{

	String name;  //String의 경우는 깊은 복제를 위해 따로 코드를 써주지 않아도 기본형 처럼 깊은 복제가 됨. 
	int age;
	int[] scores = null;
	Car car = null;
	
	//생성자 
	public Member(String name, int age, int[] scores, Car car) {
		
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		//먼저 얕은 복제(Object의 clone()메서드를 먼저 호출)
		Member cloned = (Member)super.clone();
		//Arrays.copyof는 원본배열을 길이만큼 보가함.
		//참조타입의 경우는 반드시 프로그래머가 복제되는 코드를 삽입을 해줘야 한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		return cloned; //깊은 복제를 한 cloned가 리턴 됨.
	}
	
	 
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)this.clone();	//어떤 clone()이 호출되나? 
		}
		catch(CloneNotSupportedException e) {}
		
		return cloned; 
	}
}
