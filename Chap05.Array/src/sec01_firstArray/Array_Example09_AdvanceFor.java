package sec01_firstArray;

public class Array_Example09_AdvanceFor {

	public static void main(String[] args) {
		int[] scores = new int[]{95, 71, 84, 93, 87};
		int sum = 0;
		
//			for(int i=0; i<scores.length; i++){
//			sum += scores[i];
//			}
			
//			향상된 for문(컬렉션프레임워크에서 자로 사용)
//			가져올 타입 변수명 : 가져올 장소(참조변수)
//			실행 순서 scores -> int score -> sum += score
		 
		for(int score : scores) {
			sum+=score;
		}
		System.out.println("정수 총합 = "+sum);
		double avg = (double)sum/scores.length;
		System.out.println("점수 평균 = " + avg);

	}

}
