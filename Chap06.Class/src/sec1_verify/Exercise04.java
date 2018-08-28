package sec1_verify;

import java.util.Scanner;

public class Exercise04 {
	private int radius;
	private String name;
	
	public double getArea() {
		return Math.PI*Math.pow(radius,2);
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void test() {
		String strInput;
		int numInput;
		Scanner scan = new Scanner(System.in);
		System.out.println("name ? ");
		strInput = scan.next();
		this.setName(strInput);
		
		System.out.println("radius? ");
		numInput = scan.nextInt();
		this.setRadius(numInput);
		
		System.out.printf(this.name+"의 면적은 "+"%.2f",this.getArea());
		scan.close();
	}
		
	
	public static void main(String[] args) {

		Exercise04 test = new Exercise04();
		test.test();

	}

}
