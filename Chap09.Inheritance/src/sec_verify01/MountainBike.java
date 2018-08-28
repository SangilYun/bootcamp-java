package sec_verify01;

public class MountainBike extends Bicycle {

	String frame;
	int gear;
	String money;
	
	void prtInfo() {
		System.out.println("내 자전거 상표(브랜드)가 : "+ this.brand);
		System.out.println("기어는 : "+ this.gear);
		System.out.println("프레임은 : "+ this.frame);
		System.out.println("가격은 : "+ this.money + "\n");
	}
	
	MountainBike(int gear, String brand, String frame, String money){
		super(brand);
		this.gear = gear;
		this.frame = frame;
		this.money = money;	
	}
	
	public static void main(String[] args) {
		MountainBike mb1 = new MountainBike(30, "Scott", "카본" ,"8천만");
		MountainBike mb2 = new MountainBike(27, "Giant", "알루미늄" ,"30만");
		MountainBike mb3 = new MountainBike(18, "Lespo", "철" ,"5만");
		
		mb1.prtInfo();
		mb2.prtInfo();
		mb3.prtInfo();
	}
}
