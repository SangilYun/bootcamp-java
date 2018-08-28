package sec01_verify;

public class Exercise07 {

	public static void main(String[] args) {
		int[] arr = new int[20]; //배열 만듬
		for(int i=0;i<20;i++) {	//arr[0~19]에 1~20을 각각 입력
			arr[i] =i+1;
			System.out.println("ball["+i+"] = "+arr[i]);
		}
		for(int i=0;i<arr.length;i++) { 	//shuffle 
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]<arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		System.out.println();	//출력 
		for(int i=0; i<6; i++) {
			System.out.println("ball["+i+"]="+arr[i]);
		}
	}

}
