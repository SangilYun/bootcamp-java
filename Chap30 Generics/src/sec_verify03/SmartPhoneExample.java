package sec_verify03;

public class SmartPhoneExample {

	public static void main(String[] args) {
		 SmartPhone<String,String,Double> s1 = new SmartPhone<>("Samsung","갤럭시5",5.5);
		 System.out.println(s1.getCompnay());
		 System.out.println(s1.getModel());
		 System.out.println(s1.getInch());
		 
		 System.out.println();
		 SmartPhone<String,String,String> s2 = new SmartPhone<>("lg","v20","6.0");

		 System.out.println(s2.getCompnay());
		 System.out.println(s2.getModel());
		 System.out.println(s2.getInch());
		 
	}

}
