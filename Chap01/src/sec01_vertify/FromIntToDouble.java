package sec01_vertify;

public class FromIntToDouble {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		double num3 = num2;
		
		num3 = (int)num3;
		
		System.out.print("num3를 int로 강제캐스팅 후, num1-num2의 결과 값 : " + (num1 - num2));

	}

}
