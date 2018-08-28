package sec01_exam;

public class StringEx {
	
	public static void main(String[] args) {
		
		
		String name = new String("ja"+"va");
		String str = new String(name+8.0);
		
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7+"");
		System.out.println(""+7);
		
		
		System.out.println(12346567); //integer type no string.
		System.out.println(""+1234567); // String type.   any type + String => string type
		
		
		
	}
}
