package sec_verify07;

public class Rectangle implements Cloneable{

	Point upperLeft;
	Point lowerRight;
	
	public Rectangle(int uX, int uY, int lX, int lY) {
		upperLeft = new Point(uX,uY);
		lowerRight = new Point(lX,lY);
	}
	
	public void changePos(int ux, int uy, int lx, int ly) {
		upperLeft.changePos(ux, uy);
		lowerRight.changePos(lx, ly);
	}
	
	public void showPosition() {
		System.out.println("[직사각형 위치 정보]");
		System.out.print("좌 상단 : ");
		upperLeft.showPosition();
		System.out.print("우 하단 : ");
		lowerRight.showPosition();
	}
	
	public Object clone() {
		Rectangle cloned=null;

		try {
			cloned = (Rectangle)super.clone();
			cloned.upperLeft = (Point)upperLeft.clone();
			cloned.lowerRight = (Point)lowerRight.clone();
			
		}
		catch(CloneNotSupportedException e) {
			
		}
		return cloned;
	}
}
