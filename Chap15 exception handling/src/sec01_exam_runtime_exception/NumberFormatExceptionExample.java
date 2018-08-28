package sec01_exam_runtime_exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		 
		String data1 = "100";
//		String data2 = "a100";
		
		@SuppressWarnings("unused")
		int value1 = Integer.parseInt(data1);
		
//		//NumberFormatException 발생 이유?
//		@SuppressWarnings("unused")
//		int value2 = Integer.parseInt(data2); //여기서 오류가 남. data2 의 String값이 int로 변활 될 수 없다.

	}

}
