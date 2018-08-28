package sec02_verify;

import java.util.Arrays;

public class Exercise10 {
	
	public int max(int[] arr) {
		int max = 0;
		if (arr==null || arr.length==0) {
			return -999999;
		}
		else {
			for(int i=0; i<arr.length;i++) {
				if (arr[i]>=max) {
					max = arr[i];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {23,72,9,54,1747};
		Exercise10 test = new Exercise10();
		System.out.println("현재 배열 상태입니다. \n" + Arrays.toString(arr));
		System.out.println("배열의 최대값 : " + test.max(arr));
		
		int[] arr2 = null;
		System.out.println("null값을 줬을 때 : " + test.max(arr2));
		
		int[] arr3 = new int[] {};
		System.out.println("크기가 0인 배열의 주소를 줬을 때 : " + test.max(arr3));
	}
}
