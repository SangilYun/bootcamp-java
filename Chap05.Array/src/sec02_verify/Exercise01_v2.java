package sec02_verify;


import java.util.Scanner;

public class Exercise01_v2 {

	public static void main(String[] args) {
		int input;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input : "); // get input
		input = scan.nextInt();
		
		String[][] arr = new String[input][input]; // assign 
		for(int i=1; i<=input;i++) {
			for(int j=0; j<i;j++) {
			arr[i-1][j]="*";	//최소 한개를 찍어주기 위해서 for문에서 i가 1부터 시작함.
			}						//때문에 for loop안에 i<=input이고  arr[i-1]로 시작함.
		}
		
		for(int i =0; i<arr.length; i++) { //shuffle
			int randomPosition = (int)(Math.random()*arr.length);
			String[] tmp = arr[randomPosition];
			arr[randomPosition] = arr[i];
			arr[i] = tmp;
		}
		
		for(int i=arr.length-1;i>=0;i--) { 		//printing 뒤에서부터 프린트함. 
			for(int j=arr[i].length-1; j>=0;j--) {	//arr[j][i]인것에 주의.
				if(arr[j][i]==null)
					System.out.printf("\t");
				else
					System.out.printf("\t%s",arr[j][i]);
			}System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
		System.out.printf("\t%d",i);
		}
		scan.close();
	}
}
