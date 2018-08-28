package sec01_verify;
import java.util.Arrays;

public class Exercise13 {

	public static void main(String[] args) {
		int max_num = 0;
		int[] arr = new int[9];
		
		System.out.println("실행결과");		//랜덤 숫자 생성, 같은 숫자는 같은 index에 count
		for(int i=0;i<100;i++) {
			int ran_num = (int)(Math.random()*9);
			System.out.print(ran_num + " ");
			arr[ran_num] ++;
		}System.out.println();
		
		for(int i =0; i<arr.length;i++) {	//제일 큰 숫자를 골라 냄.
			if(arr[max_num] <= arr[i]) {
				max_num = i;
			}
		}
		System.out.println(Arrays.toString(arr));		
		System.out.println("가장 많이 생성된 수는 : "+max_num+", "+arr[max_num]+"번");
	}

}
