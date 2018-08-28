package sec_verify02;

public class Bowlexample {

	public static void main(String[] args) {
	Bowl<String,String> b = new Bowl<>("박근혜","대통령");
	System.out.println("이름 : " + b.getK() + "\n직업 : " + b.getV());
	
	Bowl<String,Integer> b1 = new Bowl<>("박근혜",65);
	System.out.println("이름 : " + b1.getK() + "\n직업 : " + b1.getV());

	}
	
}
