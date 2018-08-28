package sec_verify05;

public class StringStack implements Stack {

	private String[] stack;
	private int length;
	public int index;
	
	public StringStack(int length) {
		this.length = length;
		this.index=0;
		System.out.println(length+ "개의 스택영역이 생성되었습니다.");
		stack = new String[length];
	}
	@Override
	public int length() {
		return this.length;
	}

	@Override
	public Object pop() {
		String prev = stack[this.index-1];
		stack[this.index-1] = null;
		this.index --;
		return prev;
	}

	@Override
	public void push(Object input) {
		stack[this.index] = input.toString();
		System.out.println(stack[index]+"가 스택에 저장되었습니다.");
		System.out.printf(stack[index]+"문장이 %d 번째 스택에 저장되었습니다.\n",index+1);
		this.index++;
	}
}
