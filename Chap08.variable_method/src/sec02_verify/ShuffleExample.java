package sec02_verify;

import java.util.Arrays;
import java.util.Collections;

public class ShuffleExample {
	
	static int[] shuffle(int[] arr) {
		int temp;
		for(int i=0; i<arr.length;i++) {
			int index = (int)(Math.random()*9);
			temp = arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		int[] shuffled =ShuffleExample.shuffle(original);
		System.out.println(Arrays.toString(shuffled));
		
		System.out.println();
		Integer[] array =new Integer[]{1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(array));
		Collections.shuffle(Arrays.asList(array));
		System.out.println(Arrays.toString(array));
	}

}
