package sec02_verify;

public class Exercise12 {
	public static void main(String[] args) {
		
		int num_of_row = 5;
		int mid_row = (num_of_row/2) +1 ;
//		int num_space =3;
		
		//initialize star with 1
		int num_star = 1;
		
		//printing upper half of the diamond
		for (int i = mid_row; i>0; i--) {
			//printing i space at the beginning of each row
			for(int j = 1; j<=i ; j++) {
				System.out.print(" ");
			}
			//printing * at the end of each row
			for(int j = 1; j<=num_star ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			//Incrementing the row
			num_star += 2;
			
		}
		
		//initializing
		num_star =3;
		//printing lower half
		for(int i=0; i< mid_row; i++) {
			//printing i space at the beginning of each row
			
			for(int j=1; j<=num_of_row - mid_row; j++) {
				System.out.print("r");
//				System.out.print("i :" +i);
//				System.out.print("numrow-midrow :" + (num_of_row - mid_row));
			}
			//printing * at the end of each row
			for(int j=num_star; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
			num_star -=2;
		}
    }
	

}
