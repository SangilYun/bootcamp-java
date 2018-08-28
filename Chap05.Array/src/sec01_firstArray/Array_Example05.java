package sec01_firstArray;

public class Array_Example05 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) { //배열에 1~5를 저장.
			arr[i]=i+1;
		}
		
		System.out.println("변경전 - arr.length:"+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		int[] tmp = new int[arr.length*2];
		//배열 arr에 저장된 값들을 배열 tmp에 복사한다.
		for(int i=0; i<arr.length;i++) {
			tmp[i]=arr[i];
		}
		arr=tmp; //tmp에 저장된 주소값을 arr에 저장한다.
		System.out.println("변경 후 - arr.length:"+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
	}

}
