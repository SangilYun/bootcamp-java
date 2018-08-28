package sec_verify04;

public class ProductExample {

	public static void main(String[] args) {

		Product<Audio,Monitor,Integer> p = new Product<>(
				new Audio("Sony","최상",4), new Monitor("sam", 27),350000);
		
		System.out.println(p.getA().getBrand());
		System.out.println(p.getA().getQuality());
		System.out.println(p.getA().getChannel());
		
		System.out.println(p.getM().getCompany());
		System.out.println(p.getM().getInch());
		System.out.println(p.getI());
	}

}
