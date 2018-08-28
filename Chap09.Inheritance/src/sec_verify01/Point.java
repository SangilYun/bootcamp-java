package sec_verify01;

public class Point {
	int x;
	int y;
	
	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void showPoint() {
		System.out.println("(x :" + this.x + " , y : " + this.y+")");
	}
	
	Point(){}
}
