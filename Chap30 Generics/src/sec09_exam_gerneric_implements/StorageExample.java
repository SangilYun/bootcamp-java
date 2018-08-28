package sec09_exam_gerneric_implements;

public class StorageExample {

	public static void main(String[] args) {
		 
		//인터페이스 제네릭 타입의 참조변수가 구현클래스를 참조하고 있다. (다형성)
		Storage<String> st = new StorageImpl<>(10);
		
		//제네릭 인터페이스 타입의 참조변수로 구현클래스의 메서드를 호출 
		for(int i=0; i<10; i++) {
			st.add("슈퍼카" + (i+1) , i);
		}
		
		for(int i=0; i<10; i++) {
			String str = st.get(i);
			System.out.println("저장된 객체파일[" + i +"] : " + str);
		}

		System.out.println();
		//구현클래스의 참조변수를 갖고 인터페이스를 구현한 구현클래스의 메서드를 호출 
		StorageImpl<Integer> si = new StorageImpl<>(10);
		
		for(int i=0; i<10; i++) {
			si.add(100+(i+1), i);
		}
		
		for(int i=0; i<10; i++) {
			int num = si.get(i);
			System.out.println("저장된 객체파일[" + i +"] : " + num);
		}
	}
}
