package sec02_verify;

public class Exercise14_v2 {

	public static void main(String[] args) {
		int row=0;
		int col=0;
		int total_row = 6;
		
		for(row=0; row<total_row/2; row++) { //upper half of the pattern
			for (col=0; col<6; col++) {
				 if(row>=col || (col>2 && row+col>=5))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(row=3; row<total_row; row++) { //lower half of the pattern
			for(col=0; col<6; col++) {
				if((row+col<=5 && col<=3) || (col>=3 && col/row >=1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			}
		}
}
