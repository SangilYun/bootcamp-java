package sec_verify01;

public abstract class MyPoint {

	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	protected abstract void move(int x, int y);
	
	protected abstract void reverse();
	
	protected void show() {
		
	}
	
}
