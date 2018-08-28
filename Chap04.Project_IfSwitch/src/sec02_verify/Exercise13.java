package sec02_verify;

public class Exercise13 {

	public static void main(String[] args) {
		int row;
		int col;
		
		for(row=0; row<5 ; row++) {
			for(col=0; col<5; col++) {
				if(row == col || row+col ==4) 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
