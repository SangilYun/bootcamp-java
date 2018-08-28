package sec02_verify;

public class PlayerExample {

	public static void main(String[] args) {
		Player p1 = new Striker("이동국", 36, 20, 60, 70);
		Player p2 = new Striker("메시", 28, 10, 97, 98);
		Player p3 = new MidFielder("박지성", 34, 7, 85, 85);
		Player p4 = new Defender("김영권", 31, 33, 80, 99);
		Player p5 = new Goalkeeper("이운재", 40, 28, 45, 99);
		
		p1.infoPrint();
		p2.infoPrint();
		p3.infoPrint();
		p4.infoPrint();
		p5.infoPrint();
	}

}
