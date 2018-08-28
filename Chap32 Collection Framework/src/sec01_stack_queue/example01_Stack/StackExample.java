package sec01_stack_queue.example01_Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		 //coin을 저장하는 stck컬렉션을 생성함 
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//coinBox에서 동전을 저장함.(LIFO)
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(150));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(4));
		coinBox.push(new Coin(500));
		

		while(!coinBox.isEmpty()) {
			//제일 늦게 들어간 동전을 하나씩 뺀다.
			Coin coin = coinBox.pop();
			//출력결과는 후입선출이 된 모습을 볼 수가 있다.
			System.out.println("꺼내온 동전 : " + coin.getValue());
		}
	}
}
