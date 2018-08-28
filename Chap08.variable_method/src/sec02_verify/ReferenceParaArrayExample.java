package sec02_verify;

import java.util.Arrays;

public class ReferenceParaArrayExample {

	
	static void printArr(int[] arr) { //배열의 모든 요소를 출력
		System.out.println("정렬 전 : " + Arrays.toString(arr));
	}
	static void sortArr(int[] arr) { //오름차순으로 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void Arrsum(int[] arr) {//합 계산
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4};
		ReferenceParaArrayExample.printArr(arr);
		ReferenceParaArrayExample.sortArr(arr);
		ReferenceParaArrayExample.Arrsum(arr);
	}

}
