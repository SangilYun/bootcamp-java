package sec_verify05;

public class Rect extends Shape{
	
	double width;
	double height;
	
	public Rect(double w, double h) {
		this(new Point(0,0),w, h);
	}
	
	public Rect(Point p, double w, double h) {
		this.p = p;
		this.width = w;
		this.height = h;
	}

	@Override
	public double calcArea() {
		return this.width * this.height;
	}
	
	public boolean isSquare() {
		if(this.width ==0 || this.height ==0)
			return false;
		return true;
	}
}
