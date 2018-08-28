package sec03_exam_multitype_parameter;

public class ProductExample {

	public static void main(String[] args) {
		 
		//Product<Tv, String> product1 = new Product<Tv,String>();
		Product<Tv, String> pro1 = new Product<Tv,String>();
		
		pro1.setT(new Tv(2016,06));
		pro1.setM("LG OLED 스마트 TV");
		
		Tv tv = pro1.getT();
		String str1 = pro1.getM();
		System.out.println("year : " + tv.getYear() + "month :" + tv.getMonth()+" " + str1);
		System.out.println();
		
		
		Product<Car,String> pro2 = new Product<>();
		pro2.setT(new Car("Samsung", 2010, 05));
		pro2.setM("new sm5");
		
		Car car = pro2.getT();
		String str2 = pro2.getM();
		
		//System.out.println(str1);
		System.out.println("year : " + car.getYear() + "month :" + car.getMonth()+" brand : "+ car.getBrand() +" "+ str1);

	}

}
