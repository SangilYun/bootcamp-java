package sec01_exam;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1; //1~6
		
		
		System.out.println(num);
		switch(num) {
			case 1 :
				System.out.println("number1");
				break;
			case 2 :
				System.out.println("number2");
				break;
			case 3 :
				System.out.println("number3");
				break;
			case 4 :
				System.out.println("number4");
				break;
			case 5 :
				System.out.println("number5");
				break;
			default :
				System.out.println("number6");
		}

	}

}
