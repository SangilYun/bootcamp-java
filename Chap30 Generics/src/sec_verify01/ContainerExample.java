package sec_verify01;

public class ContainerExample {

	public static void main(String[] args) {
		Container<String> cs = new Container<String>();
		cs.setT("홍길동");
		System.out.println(cs.getT());

		Container<Integer> ci = new Container<>();
		ci.setT(150);
		System.out.println(ci.getT());

	}
}
