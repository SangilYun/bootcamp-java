package sec02_verify;

public class Exercise12_version3 {
	public static void main(String[] args) {
		
		int i,j,k; 
		
		for(i=1; i<=5;i++) {
			for(j=3,k=3; j>i||k<i;j--,k++) {
				System.out.print(" ");
			}
			for(k=0; k<(j*2-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
    }
}
	

