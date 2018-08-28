package sec01_exam_runtime_exception;

public class NullPointerException {

	public static void main(String[] args) {
		 
//		String data = null;
		String data = new String("자바");
		
		//data를 null로하면 NullPointerException 발생(런타임 예외)함 그 이유는?
		System.out.println(data.toString());

	}

}
