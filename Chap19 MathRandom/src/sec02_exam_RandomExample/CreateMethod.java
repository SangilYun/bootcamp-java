package sec02_exam_RandomExample;

import java.util.Arrays;

public class CreateMethod {

	//여기에서 쓰인 getRand, fillRand와 같은 메서드는 직접 만든 것이다.
	//API에서 제공하지 않으면 직접 자기가 만들어서 사용하고 공유하면 좋다.
	//(실제 현업에서도 만든 메서드들도 많다.)
	
	public static void main(String[] args) {
	
		//Random rand = new Random();
		for(int i=0; i<10; i++)
			System.out.print(getRand(5,10)+",");
		
		System.out.println();
		int[] result = fillRand(new int[10], new int[] {2,3,7,5});
		System.out.println(Arrays.toString(result));
	}
	
	//오버로딩 됨
	//arr에 from부터 to까지의 수를 랜덤으로 발생시켜 리턴함.
	public static int[] fillRand(int[] arr, int from, int to) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = getRand(from, to);
		}
		return arr;
	}
	
	//arr에 data배열의 값으로 채워서 리턴
	public static int[] fillRand(int[] arr, int[] data) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=data[getRand(0, data.length-1)];
		}
		return arr;
	}
	
	//사이의 수를 랜덤으로 리턴
	public static int getRand(int from, int to) {
		return (int)(Math.random() * (Math.abs(to-from)+1)) + Math.min(from, to);
	}
}
