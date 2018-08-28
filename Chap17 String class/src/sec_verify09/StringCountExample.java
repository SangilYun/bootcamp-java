package sec_verify09;

public class StringCountExample {

	//helper method
	public static int counter(String input, String words) {
		int i=0; //index
		int a=0; //counter
		while(i!=-1) {
			i = input.indexOf(words);
			if(i!=-1) {
				input = input.substring(i+words.length());
				a++;
			}		
		}
		return a;
	}
	
	public static void main(String[] args) {
		String input1 = "대구를 사랑합시다. 대구!";
		String input2 = "I like LG, I like Pizza!";
	    System.out.println(counter("aaaaa", "a"));// test
		System.out.println("대구를 사랑합시다. 대구! <-- 문자열에는 대구라는 단어가 총 "+ counter(input1,"대구")+"번 있어요.");
	    System.out.println("I like LG, I like Pizza! <-- 문자열에는 대구라는 단어가 총 "+counter(input2,"대구")+"번 있어요.");
	}

}
