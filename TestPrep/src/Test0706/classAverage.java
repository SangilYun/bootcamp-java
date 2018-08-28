package Test0706;

import java.util.Scanner;

public class classAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("반수 : ");
		int[][] classArr = new int[scan.nextInt()][];
		
		for(int i =0; i<classArr.length;i++) {
			System.out.println("반인원 : ");

			classArr[i] = new int[scan.nextInt()];
			for(int j =0; j<classArr[i].length; j++) {
				System.out.println("점수 : ");
				classArr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("반\t합계\t평균");
		int total=0;
		for(int i=0; i<classArr.length;i++) {
			int sum=0;
			for(int j=0; j<classArr[i].length;j++) {
				sum+=classArr[i][j];
				
			}
			total+=sum;
			System.out.print(i+1 +"\t" + sum+"\t");
			System.out.println(sum/classArr[i].length);
			System.out.println();
		}
		System.out.println("평균\t"+total+"\t"+total/classArr.length);
		scan.close();

	}

}
