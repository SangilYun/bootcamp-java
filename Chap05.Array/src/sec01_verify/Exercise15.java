package sec01_verify;
import java.util.Scanner;
public class Exercise15 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int input;
		int count=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하는 점수를 계속 입력하세요 (-1을 입력하면 빠져나갑니다.)");
		for(int i=0; i<arr.length;i++) {
			input = scan.nextInt();
			if(input == -1)	//-1을 입력하면 종료.
				break;
			arr[i] = input;	//아니면 값 입력.
			count ++;
			}if(count>=3) {	//입력 받은 값이 3개 이상일 때
			System.out.print("마지막 3개 값은 ");
				for(int i=count-3;i<count;i++) {
					System.out.print(arr[i]+" ");
				}
			}else {
				System.out.print("마지막 "+count+"개 값은 ");
				for(int i=0; i<count;i++) {	//입력받은 값이 3개 미만일 때
					System.out.print(arr[i]+" ");
				}
			}
		scan.close();
	}
}
