package sec03_exam_overloading;

public class Overloading {
	
	public int add(int a, int b) {
		System.out.println("int add(int a , int b)");
		return a+b;
	}
	
	public long add(int a , long b) {
		System.out.println("long add(int a , long b)");
		return a+b;
	}
	
	public long add(long a , int b) {
		System.out.println("long add(long a , int b)");
		return a+b;
	}
	
	public long add(long a , long b) {
		System.out.println("long add(long a , long b)");
		return a+b;
	}
	
	public int add(int[] a) {
		System.out.println("int add(int[] a) - ");
		int result =0;
		for(int i=0; i<a.length;i++) 
			result += a[i];
		return result;
	}

	public static void main(String[] args) {

	}

}
