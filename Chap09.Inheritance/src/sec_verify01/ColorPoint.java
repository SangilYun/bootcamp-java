package sec_verify01;

public class ColorPoint extends Point{

	String color;
	void setColor(String color) {
		this.color = color;
	}
	
	void showColorPoint() {
		System.out.print("색상이 "+ this.color+"점의 좌표 : ");
		this.showPoint();
	}
	
	ColorPoint(){}
	
	public static void main(String[] args) {

		ColorPoint pR = new ColorPoint();
		pR.set(3, 4);
		pR.setColor("레드");
		
		ColorPoint pB = new ColorPoint();
		pB.set(10, 50);
		pB.setColor("블루");
		
		ColorPoint pY = new ColorPoint();
		pY.set(20, 17);
		pY.setColor("노랑");
		
		ColorPoint pG = new ColorPoint();
		pG.set(2, 1);
		pG.setColor("그린");
		
		pR.showColorPoint();
		pB.showColorPoint();
		pY.showColorPoint();
		pG.showColorPoint();
	}

}
