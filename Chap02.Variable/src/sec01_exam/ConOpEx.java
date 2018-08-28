package sec01_exam;

public class ConOpEx {

	public static void main(String[] args) {
		int score = 92;
		char grade = (score > 90) ? 'A' : ((score > 80)? 'B':'C');
		System.out.println(score + "점은 " +grade+"등급입니다. ");

	}

}
