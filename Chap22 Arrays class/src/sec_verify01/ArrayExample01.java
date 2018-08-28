package sec_verify01;

import java.util.Arrays;

public class ArrayExample01 {

	public static void main(String[] args) {
		
		System.out.println("1차원 배열의 방수를 입력 : 5" );
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 88;
		arr[3] = 1;
		arr[4] = -3;
		System.out.println("입력하신 배열값을 출력합니다.");
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("어떤 값을 찾으십니까? -3");
		Arrays.sort(arr);
		System.out.println("소팅 후 .");
		System.out.println("arr = " + Arrays.toString(arr));
		int i =  Arrays.binarySearch(arr,-3);
		
		System.out.println("-3은 arr배열의 "+i+"번째 방에 있습니다.");

	}

}
