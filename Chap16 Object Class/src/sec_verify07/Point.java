package sec_verify07;

public class Point implements Cloneable{
	int xPos;
	int yPos;
	
	public Point(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}
	public void changePos(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}
	public void showPosition() {
		System.out.println("[ " + this.xPos +", " + this.yPos + " ]");
	}
	
	@Override
	public Object clone() {
		Object cloned = null;
		try {
			cloned = (Point)super.clone();
		}
		catch(CloneNotSupportedException e) {}
		return cloned;
	}
}
