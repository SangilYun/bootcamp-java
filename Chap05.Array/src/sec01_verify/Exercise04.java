package sec01_verify;
	
public class Exercise04 {

	public static void main(String[] args) {
		int[] score = new int[] {79,88,91,33,100,55,95};
		
		for(int i=0; i<score.length;i++) { 
			for(int j=0; j<score.length-1;j++) {
				if(score[j] > score[j+1]) {	//주어진 배열을 오름차순 정렬
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			} 
		}		//배열의 마지막 값, 첫번째 값 출력
		System.out.println("maximum : " + score[score.length-1]);
		System.out.println("minimum : " + score[0]);
	}
}
