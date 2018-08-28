package sec06_finalize;

public class Counter {
	
	private int no;
	
	public Counter(int no) {
		this.no= no;
	}

	//웬만하면 finalize()는 재정의하지 않는다.
	@Override
	protected void finalize() throws Throwable{
		System.out.println(this.no + "번 객체의 finalize()가 실행됨.");
	}
}
