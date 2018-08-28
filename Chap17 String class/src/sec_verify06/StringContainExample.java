package sec_verify06;

public class StringContainExample {

	public static void main(String[] args) {
		 String input1 = "I like Java";
		 String input2 = "I like Java";
		 System.out.println("첫 번째 문장을 입력해보세요 : " + input1);
		 System.out.println("두 번째 문장을 입력해보세요 : " + input2);

		 if(input1.equals(input2)) {
			 System.out.println("입력한 두 문장은 같은 문장이네요");
			 if(input1.contains("Java")) {
				 System.out.println("입력한 두 문장에는 Java가 포함되어 있네요.");
			 }
		 }else {
			 System.out.println("불일치");
		 }
		 


	}

}
