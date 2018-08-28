package sec02_verify;

public class Exercise12_version2 {
	public static void main(String[] args) {
		
		int num_row = 5;
		int mid_row = (num_row/2) +1 ;
		int init_num_space ;
		int num_star;
		
		num_star =1;
		init_num_space = 2;
		for (int i = mid_row; i>0; i--) {
			for(int j = 0; j<=init_num_space ; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=num_star ; j++) {
				System.out.print("*");
			}
			System.out.println();
			num_star += 2;
			init_num_space --;
			
		}
		
		num_star =3;
		init_num_space = 2;
		for(int i=0; i< mid_row; i++) {
			for(int j=1; j<=init_num_space; j++) {
				System.out.print(" ");
			}
			for(int j=num_star; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
			num_star -=2;
			init_num_space ++;
		}
    }
	
}
