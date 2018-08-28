package sec08_exam_gerneric_extends;

public class ChildProductExample {

	public static void main(String[] args) {
		 
		Product<Tv, String> product = new ChildProduct<>(); //필드의 다형성
		ChildProduct<Tv,String,String> childProduct = new ChildProduct<>();
		
		product.setKind(new Tv());
		product.setMode("캡션TV");
//		product.setCompany("삼성"); //에러? 근본이 다릅니다. setCompany가 ChildProduct클래스에만 있는 메서드이다. 
		
		String pmodel = product.getMode();
		System.out.println(pmodel);
		
		childProduct.setKind(new Tv());
		childProduct.setMode("스마트 TV");
		childProduct.setCompnay("LG");
		
		String model = childProduct.getMode();
		String company = childProduct.getCompany();
		
		System.out.println(company+" : " + model);
	}
}
