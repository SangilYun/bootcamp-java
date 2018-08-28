package sec_verify01;

public class MyColorPoint extends MyPoint{
	
	String color;
	
	public MyColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	@Override
	protected void move(int x, int y) {
		
	}
	@Override
	protected void reverse() {
		int temp = this.x;
		this.x = this.y;
		this.y = temp;
		System.out.println("x와 y의 값을 바꿨습니다.");
	}
	
	protected void show() {
		System.out.println("현재 x, y의 값 : " + this.x +", "+ this.y+ ", "+ this.color);
	}

	public static void main(String[] args) {
		MyColorPoint test = new MyColorPoint(2,3,"blue");
		test.show();
		test.reverse();
		test.show();

	}

}
