package sec01_verify;
import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) { //입력 받은 값을 지폐와 동전을 이용하여 표현. 
		int input;							 //이때 필요없는 지폐/동전(0으로 나타나는 값)은 출력하지 않음.
		String[] arr = new String[] {"50000","10000","5000","1000","100","50","10","5","1"};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input : ");
		input = scan.nextInt();
		
		for(int i=0; i<arr.length;i++) {
			int st_to_num = Integer.parseInt(arr[i]);
			if(input/st_to_num!=0 && st_to_num>=1000) {	//지폐일 때, 나눈 값이 0이 아닐 때.
				System.out.println(arr[i]+"원권 :"+ input/st_to_num +"매");
			}
			else if(input/st_to_num !=0 && st_to_num<1000){ //동전일 때, 나눈 값이 0이 아닐 때.
				System.out.println(arr[i]+"원짜리 동전 : "+ input/st_to_num +"개");
			}
			input = input % st_to_num;		//input을 나머지 값으로 설정.
		}
	scan.close();
	}
}
