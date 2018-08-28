package sec_verify04;

import java.util.Arrays;

public class MainArgumentExample {

	public static void main(String[] args) {
		String text = "나는=김지훈&ID=perpear&국어점수=90&수학점수=98&자바점수=100";
		String[] strArr = text.split("[=&]");
		
		System.out.println(Arrays.toString(strArr));
		for(int i=2; i<strArr.length; i+=2) {
			System.out.println(strArr[i-2]+"  " + strArr[i-1]);
		}
	}

}
