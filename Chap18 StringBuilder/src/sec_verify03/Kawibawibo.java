package sec_verify03;

import java.util.Scanner;

public class Kawibawibo {

	public static void main(String[] args) {
		String input;
		String[] comp_choice_list = null;
		String[][] arr = new String[][]{
			{"가위","바위","보"},
			{"바위","보","가위"},
			{"보","가위","바위"}
		};
		System.out.println("'가위(1)', '바위(2)', '보(3)'를 입력하세요.\n종료하시려면 '그만'을 입력하시면 됩니다.");

		Scanner scan = new Scanner(System.in);
		while(true) {

			System.out.println("입력 :");
			input = scan.nextLine();		
			if(input.equals("4")) {//get input
				break;
			}else if(input.equals("1")) { 
				comp_choice_list = arr[0];
			}else if(input.equals("2")) {
				comp_choice_list = arr[1];
			}else if(input.equals("3")){
				comp_choice_list = arr[2];
			}else {
				System.out.println("잘못 입력");
				continue;
			}
			
			int comp_choice = (int)(Math.random()*3); //0-> tie, 1->lose, 2->win
			if(comp_choice==0) {
				System.out.println("사용자 = "+ input +", 컴퓨터 = "+ 
					comp_choice_list[comp_choice]+" 비겼습니다.");
			}else if(comp_choice==1) {
				System.out.println("사용자 = "+ input +", 컴퓨터 = "+ 
						comp_choice_list[comp_choice]+" 졌습니다.");
			}else {
				System.out.println("사용자 = "+ input +", 컴퓨터 = "+ 
						comp_choice_list[comp_choice]+" 이겼습니다.");
			}
		}//end of while 
		System.out.println("종료합니다");
		scan.close();
	}

}
