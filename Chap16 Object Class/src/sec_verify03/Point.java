package sec_verify03;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Point p) {
		if(p.x == this.x && p.y == this.y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "x : " + this.x +"이며 , y : " + this.y+"이다."; 
	}
}
