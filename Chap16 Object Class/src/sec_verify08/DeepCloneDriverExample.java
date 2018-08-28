package sec_verify08;


public class DeepCloneDriverExample {

	public static void main(String[] args) {
		Drive d = new Drive("c드라이브", 500, new String[] {"윈도우 폴더","시스템 폴더"}, new Folder("야시꾸리", 15));
		System.out.println("[원본 드라이브의 필드 값]");
		System.out.println(d);
		System.out.println();

		System.out.println("[복제 된 드라이브의 필드 값]");
		Drive cloned = (Drive)d.clone();
		System.out.println(cloned);
	}

}
