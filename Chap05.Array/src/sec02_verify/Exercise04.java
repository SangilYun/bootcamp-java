package sec02_verify;
import java.util.Scanner;
public class Exercise04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		int[][] arr = new int[6][2];
		double korAvg=0.0;
		double mathAvg=0.0;
		
		for(int i=0;i<arr.length;i++) {	//입력
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(i+1+"번째 ");
				if(j==0) 
					System.out.print("국어점수 입력 : ");
				else
					System.out.print("수학점수 입력 : ");
				input = scan.nextInt();
				arr[i][j]=input;
			}
			korAvg+=arr[i][0];
			mathAvg+=arr[i][1];
		}
		System.out.println("---------------------------");	//출력 
		System.out.printf("국어 평균 : %.2f \n수학 평균 : %.2f",korAvg/6,mathAvg/6);
		System.out.println();
		System.out.println("---------------------------");
		
		for(int i=0; i<arr.length;i++) {
			double sum=0.0;
			for(int j=0; j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			System.out.println(i+"번째 학생의 평균 : "+sum/2);
		}
		scan.close();
	}

}
