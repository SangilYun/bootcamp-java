package sec01_firstArray;

public class Array_Example02 {

	public static void main(String[] args) {
		int sum=0;
		float average=0.0f; //(f안붙으면 (접미사) 에러 뜬다)
		
		int[] score = new int[] {100,88,100,100,90};
		System.out.println("배열의 길이 : " + score.length);
		System.out.println("배열의 길이 : "+ score.length);
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		average = sum/(float)score.length;
		
		System.out.println("총점 : "+ sum);
		System.out.println("평균 : "+average);
	}

}
