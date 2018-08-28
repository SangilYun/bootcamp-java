package sec01_verify;
import java.util.Scanner;
public class Exercise05_1 {

	public static void main(String[] args) {
		int score;
		String grade = null;
		
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
	    score = scan.nextInt();
	    
/*	    if (score/10 >= 9) {
	    	grade = (score >= 95) ? "A+" : "A-";
	    }
	    else if(score/10 == 8) {
	    	grade = (score >= 85) ? "B+" : "B-";
	    }
	    else if(score/10 == 7) {
	    	grade = (score >= 75) ? "C+" : "C-";
	    }
	    else if(score/10 == 6) {
	    	grade = (score >= 65) ? "D+" : "D-";
	    }
	    else {
	    	grade = "F";
	    }*/
		
	    switch(score/10) {
	    case 10:
	    case 9:
	    	grade = (score >= 95) ? "A+" : "A-";
	    	break;
	    case 8:
	    	grade = (score >= 85) ? "B+" : "B-";
	    	break;
	    case 7:
	    	grade = (score >= 75) ? "C+" : "C-";
	    	break;
	    case 6:
	    	grade = (score >= 65) ? "C+" : "C-";
	    	break;
	    default :
	    	grade = "F";
	    }
	    
	    System.out.println("당신의 학점은 : "+ grade);
		scan.close();
		

	}

}
