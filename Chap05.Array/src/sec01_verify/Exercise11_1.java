package sec01_verify;
import java.util.Scanner;
public class Exercise11_1 {

	public static void main(String[] args) {
		int count;
		System.out.println("3,6,9 게임을 시작합니다.\n몇번까지 실행할까요?");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i =0; i<input ; i++) { //filtering
			if(String.valueOf(i).contains("3") || 
					String.valueOf(i).contains("6") ||
					String.valueOf(i).contains("9")) {
				System.out.print(i);
				
				String int_to_string = String.valueOf(i);//int를 string으로 변환 후 한자리씩 비교하여 
				count = 0;								//박수 몇번 칠지결정. charAt==0(char 48)이면 패스.

				for(int j=0; j<int_to_string.length();j++) { 
					if(int_to_string.charAt(j) !='0' && int_to_string.charAt(j) %3 ==0) {//48 or '0'
						count ++;
					}
				}
				System.out.println(" 박수 "+count+"번");
			}
		}
		scan.close();
	}
}


