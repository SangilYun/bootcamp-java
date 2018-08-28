package sec_verify06;

public class Stack<T> {

	int tos;
	int capacity;
	Object[] stck;
	
	public Stack(int capacity) {
		this.capacity = capacity;
		stck = new Object[this.capacity];
		this.tos =0;
	}
	
	public void push(T item) {
		try {
		stck[tos] = item;
		tos++;	//tos를 이용해서 index를 추적할 경우
//		capacity--;	//capacity를 이용해서 index를 추적할 경우
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("스택이 꽉 찼네요\n예외 발생으로 프로그램을 정상 종료합니다.\n"+e);
		}
	}
	
	public T pop() {
		try {
			tos--;
			T o = (T) stck[tos];
//		    T o = (T) stck[capacity];
//			capacity++;
			return o;
		}catch(Exception e) {
			System.out.println("스택이 비었네요");
		}
		return null;
		
	}
}
