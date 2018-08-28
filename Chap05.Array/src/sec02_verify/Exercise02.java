package sec02_verify;

public class Exercise02 {

	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		int col0Sum=0;
		int col1Sum=0;
		int col2Sum=0;
		int col3Sum=0;

		for(int i=0; i<score.length;i++) {
			int rowSum=0;
			col0Sum += score[i][0];
			col1Sum += score[i][1];
			col2Sum += score[i][2];
			
			for(int j=0; j<score[i].length;j++) {
				System.out.printf("\t%d", score[i][j]);
				rowSum += score[i][j];
			}
			System.out.printf("\t%d",rowSum);
			System.out.println();
			col3Sum+= rowSum;
		}
		System.out.printf("\t%d \t%d \t%d \t%d", col0Sum,col1Sum,col2Sum,col3Sum);
	}

}
