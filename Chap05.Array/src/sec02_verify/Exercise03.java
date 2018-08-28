package sec02_verify;

public class Exercise03 {

	public static void main(String[] args) {
		int[][] score = {
				{88,95,100},
				{85,63,20},
				{34,30,30},
				{40,49,70},
				{15,75,98}
		};
		int korSum=0;
		int engSum=0;
		int mathSum=0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==============================================");
		
		for(int i=0;i<score.length;i++) {
			int sum=0;
			double avg=0;
			
			korSum+=score[i][0];
			engSum+=score[i][1];
			mathSum+=score[i][2];
			
			for(int j=0; j<score[i].length;j++) {
				System.out.printf("%d \t%d", i,score[i][j]);
				sum+=score[i][j];
			}
			avg=sum/score[i].length;
			System.out.printf("\t%d \t%.1f", sum,avg);
			System.out.println();
		}
		System.out.println("==============================================");
		System.out.print("총점 ->");
		System.out.printf("\t[국어]%d   [영어]%d   [수학]%d", korSum, engSum, mathSum);
	}

}
