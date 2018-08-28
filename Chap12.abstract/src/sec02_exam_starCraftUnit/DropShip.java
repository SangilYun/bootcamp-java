package sec02_exam_starCraftUnit;

public class DropShip extends Unit{
	String str;
	
	//생성자
	public DropShip() {}
	
	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("드랍쉽의 위치 : "+this.x+ "," + this.y + "로 이동함.");
	}

	//탱크클래스 자기만의 고유한 메서드도 정의 가능
	public void load() {
		this.str = "탑승 모드 : 유닛 탑승";
		System.out.println(this.str);
	}
	
	public void unload() {
		this.str = "탑승 모드 : 유닛 하강";
		System.out.println(this.str);
	}
}
