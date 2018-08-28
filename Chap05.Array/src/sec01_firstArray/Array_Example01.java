package sec01_firstArray;

public class Array_Example01 {

	public static void main(String[] args) {
		
		int[] score = new int[10];
		int k=1;
		score[0]=50;
		score[1]=60;
		score[k+1]=70;
		score[3]=80;
		score[4]=90;

		int tmp=score[k+2]+score[4];
		
		for(int i=0; i<10; i++) {
			System.out.println("Score["+i+"]:"+score[i] );
		}

		System.out.println("tmp:"+tmp);
		System.out.println("score[7]:"+score[7]);
		System.out.println(score);//주소
	}

}
