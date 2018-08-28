package sec02_verify;

public class Exercise15 {
	public static void main(String[] args) {
// num -> maximum number in that given row, space-> space placed before number
		for(int num = 1, space=4; num<=3 && space>=2; num++, space--) {			
			for(int i=space;i>0;i--) 						
				System.out.print(" ");					
			for(int i=1; i<=num; i++)		    //upper half
				System.out.print(i);			//including the middle line
			for(int j=num-1; j>0; j--) 
				System.out.print(j);
			System.out.println();
		}
		for(int num = 2, space=3; num>0 && space<=4; num--, space++) { 
			for(int i=space;i>0;i--)
				System.out.print(" ");
			for(int i=1; i<=num; i++) 			//lower half
				System.out.print(i);
			for(int j=num-1; j>0; j--) 
				System.out.print(j);
			System.out.println();
			
		}		
	}
}