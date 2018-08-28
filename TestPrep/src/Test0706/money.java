package Test0706;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		String[] arr = new String[] {"50000","10000","5000","1000","100","50","10"};
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하세요");
		int input = scan.nextInt();
		for(int i=0; i<arr.length;i++) {
			int unit = Integer.parseInt(arr[i]);
			int rest = (input-(input/unit))/unit;
			if(rest !=0) {
			if(unit >= 1000) {
				System.out.println(arr[i]+ "지폐 : " + (input/unit) + "장");
				}
			else {
				System.out.println(arr[i]+ "동전 : " + (input/unit) + "개");
			}
			}
			input %= unit;
		}
		scan.close();

	}

}
