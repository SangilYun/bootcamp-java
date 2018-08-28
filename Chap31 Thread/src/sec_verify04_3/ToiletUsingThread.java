package sec_verify04_3;

public class ToiletUsingThread extends Thread{

	private Toilet toilet;
	private String name;
	
	public ToiletUsingThread(Toilet t, String s) {
		this.toilet = t;
		this.name = s;
		this.setName(s);
	}
	
	public void run() {
		synchronized(toilet) {
			System.out.println(this.name+" 가/이 화장실에 입장");
			toilet.use();
			System.out.println(this.name+" 가/이 사용을 마쳤습니다.\n");
		}
	}
}
