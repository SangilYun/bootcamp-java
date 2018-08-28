package sec_verify04;

public class Rect {

	private int width;
	private int height;
	
	public Rect(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public int recArea() {
		return this.width*this.height;
	}
	
	public boolean equals(Rect r) {
		if(this.recArea() == r.recArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "x : " + this.width +"이며 , y : " + this.height+"이다."; 
	}
}
