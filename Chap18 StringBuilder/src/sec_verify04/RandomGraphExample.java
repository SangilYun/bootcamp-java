package sec_verify04;

import java.util.Arrays;

public class RandomGraphExample {

	public static void printGraph(char ch, int value) {
		int [] arr = new int [value];
		
		for(int i=0; i<100; i++) {
			int ranNum = (int)(Math.random()*value);
			arr[ranNum]++;
		}
//		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+"의 개수 : "  );
			for(int j=0; j<arr[i]; j++) {
				System.out.print(ch);
			}
			System.out.println(" " + arr[i]);
		}
	}
	
	public static void main(String[] args) {
		printGraph('#',10);
	}

}
