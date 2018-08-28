package sec02_verify;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input=0;
		int stuCount=0;
		
		System.out.println("반수 : "); //row 입력 
		input=scan.nextInt();
		int[][] arr = new int[input][];
		int[] sum = new int[input];
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+1+"반의 인원 : "); //col 입력
			input=scan.nextInt();
			arr[i] =new int[input];
			
			for(int j=0;j<arr[i].length;j++) {	//점수 입력 받음.
				System.out.print(i+1+"반의 ");
				System.out.println(j+1+"의 점수");
				input=scan.nextInt();
				arr[i][j]=input;
				sum[i]+=arr[i][j];
				stuCount++;
			}	
		}
		System.out.println("반\t합계\t평균");	//출력
		System.out.println("----------------------");
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf(i+1+"반\t"+sum[i]+"\t"+"%.1f",(double)(sum[i]/arr[i].length));
			System.out.println();
		}
		System.out.println("----------------------");
		int lastRowTotal=0;
		for(int i=0;i<sum.length;i++) {
			lastRowTotal+=sum[i];
		}
		System.out.printf("계 \t%d \t%.1f",lastRowTotal,(double)lastRowTotal/stuCount);
		scan.close();
	}

}
