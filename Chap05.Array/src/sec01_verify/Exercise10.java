package sec01_verify;
import java.util.Arrays;
public class Exercise10 {

	public static void reverse(int start, int length, int[] arr) {
		if(start < length) {
			int temp = arr[start];
			arr[start] = arr[length-1];
			arr[length-1] = temp;
			reverse(++start,--length,arr);
		}
	}
	
	public static void main(String[] args) {//make a 6elements array assigned a random number and sort it out
		int[] arr = new int[6];
		for(int i=0; i<arr.length;i++) {
			int num =(int)(Math.random()*100);
			arr[i]=num;
		}
		System.out.println(Arrays.toString(arr)); // before 
	
		reverse(0,arr.length,arr);

//		for(int i=0; i<arr.length/2 ; i++) {
//			int temp=arr[i];
//			arr[i] = arr[arr.length-1-i];
//			arr[arr.length-1-i] = temp;
//		}
		System.out.println(Arrays.toString(arr)); //after
	}

}
