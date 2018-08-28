package sec01_verify;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Exercise12 {

	public static void main(String[] args) {
		int input;
		int ready=1;
		int sum=0;
		int num_stu=0;
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("실행결과");
		while(true) {
		System.out.println("---------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 |4.분석 |5.종료");
		System.out.println("---------------------------------------------");
		
		input = scan.nextInt();
		if(input == 5) { 			  		//종료 입력시
			break;
		}else if(input<1 || input>5) {		//1밑으로, 5위로 입력시 오류
			System.out.println("잘 못 입력");
		}else if(input>ready) {				//전 단계가 실행되어야 그 다음 단계를 실행할 수 있음.
			System.out.println(ready+"번을 먼저 실행하세요");
		}else {								//1을 실행하지 않고 2~4를 실행시 오류
			System.out.println("입력 : ");	
			if(input==1) {
				ready=2;
				num_stu=scan.nextInt();
			}else if(input==2) {
				ready=3;
				for (int i=0;i<num_stu;i++) {
					System.out.println("scores["+i+"]> ");
					arrL.add(scan.nextInt());
				}
			}else if(input==3) {
				ready=4;
				for(int i =0; i<arrL.size();i++) {
					System.out.println("score["+i+"]:"+arrL.get(i));
					}
			}else if(input==4) {
				ready=5;
				System.out.println("최고 점수 : "+ Collections.max(arrL));
				for(int each : arrL) {
					sum+=each;
				}System.out.println("평균 점수 : "+ sum/num_stu);
			}
		}
	}System.out.println("프로그램 종료");
	 scan.close();	
}
}