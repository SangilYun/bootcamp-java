package sec_verify05;

public class Circle {

	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.radius =r;
	}
	
	public int cirArea() {
		return (int)(Math.PI * Math.pow(this.radius,2));
	}
	
	public boolean equals(Circle c) {
		if(this.cirArea() == c.cirArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "("+ this.x +" , " +this.y + ") 반지름 : " + this.radius; 
	}
}
