package sec_verify09;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair1 = new Pair<String, Integer>("홍길동", 35);
		System.out.println(Util.getValue(pair1, "홍길동"));
	
		ChildPair<String, Integer> pair2 = new ChildPair<>("홍삼순",null);
		System.out.println(Util.getValue(pair2, "홍삼순"));
		
		OtherPair<String, String> pair3 = new OtherPair<String, String>("gasdf", "sdfsdfd");
//		System.out.println(Util.getValue(pair3, "gasdf")); --> OtherPair는 pair를 상속받지 않기 때문에 오류 발생.
	}
}
