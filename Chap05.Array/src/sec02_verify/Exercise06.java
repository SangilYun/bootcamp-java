package sec02_verify;

public class Exercise06 {

	public static void main(String[] args) {
		int[][] arr= {
				{95,86,100,55},
				{83,92,96},
				{78,83,93,87,88,77,10}
		};
		int sum=0;
		int length=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
				length++;
			}
		}
		System.out.printf("위 가변배열의 합계(sum) : %d\n위 가변배열의 평균(avg) : %.1f",sum,(double)sum/length);
	}

}
