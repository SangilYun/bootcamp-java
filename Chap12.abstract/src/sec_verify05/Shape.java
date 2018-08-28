package sec_verify05;

public abstract class Shape {

	Point p;
	
	public Shape(){
		this.p = new Point();
	}
	public Shape(Point p) {
		this.p = p;
	}
	
	public Point getPosition() {
		return p;
	}
	
	public void setPosition(Point p) {
		this.p = p;
	}
	
	public abstract double calcArea();
}
