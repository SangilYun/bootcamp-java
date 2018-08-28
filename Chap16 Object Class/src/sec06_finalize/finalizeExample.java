package sec06_finalize;

public class finalizeExample {

	public static void main(String[] args) {
		
		Counter count = null;
		
		for(int i=1; i<=50; i++) {
			count = new Counter(i);
			count = null;
			System.gc();
			//직접 gc를 호출 함.
			//실행결과를 보면 중구난방식으로 객체
			//즉, JVM마음대로 한다.
		}

	}

}
