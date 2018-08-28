package sec_verify06;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<>(10);
		//스택은 선입선출이기때문에 출력될 값과 반대로 push를 해줘야 한다. 
		s.push("서울");
		s.push("부산");
		s.push("광주");
		s.push("대구");
		s.push("현풍");
		s.push("구지");
		s.push("창녕");
		s.push("마산");
		s.push("용인");
		s.push("고양");
		s.push("dummy");
		for(int i=0; i<10; i++) {
			System.out.println(i+1+"번째 객체 값 :" + s.pop());
		}

		System.out.println();

		Stack<Integer> i = new Stack<>(10);
		i.push(111);
		i.push(301);
		i.push(150);
		i.push(770);
		i.push(528);
		i.push(665);
		i.push(1005);
		i.push(-55);
		for(int j=0; j<10; j++) {
			System.out.println(j+1+"번째 객체 값 :" + i.pop());
		}
	}
}
