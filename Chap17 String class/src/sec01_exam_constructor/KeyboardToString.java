package sec01_exam_constructor;

public class KeyboardToString {
//JVM에게 예외를 던짐 
	public static void main(String[] args) {
		byte[] bytes = new byte[100]; //기본값 0으로 셋팅
		//Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 : ");
		
		//키보드로 입력받는다.(입력받은 바이트수를 리턴)
		int readByteNo;
		
		try {
			readByteNo = System.in.read(bytes);
			String str = new String(bytes,0,readByteNo-2); //2를 이유는 ?뒤에 줄바꿈을 없애기 위해서.(엔터키)
//			str.getBytes("UTF-8");							//os차이인지-1을 해야 하는 것 같은데..?
			
			System.out.println(str);
			System.out.println("입력받은 바이트 수 : " + readByteNo);
		}catch(Exception e) {
			e.printStackTrace();
		}
		//scan.close();

	}

}
