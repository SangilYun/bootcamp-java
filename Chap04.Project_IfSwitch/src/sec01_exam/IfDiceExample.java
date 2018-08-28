package sec01_exam;

public class IfDiceExample {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) +1;
		System.out.println(num);
		
		if(num ==1) {
			System.out.println("1번이 나왔습니다.");
		}
		else if(num ==2) {
			System.out.println("number 2");
		}
		else if(num==3) {
			System.out.println("number3");
		}
		else if(num==4) {
			System.out.println("number4");
		}
		else if(num ==5) {
			System.out.println("number5");
		}
		else
		System.out.println("number6");
		

	}

}
