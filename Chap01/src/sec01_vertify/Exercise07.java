package sec01_vertify;


public class Exercise07
{
	public static void main(String[] args)
	{
		int x = 2;
		int y = 5;
		char c = 'A'; 

		System.out.println("1 + x << 33의 값 : " + (1 + x << 33));
		
		System.out.println("y >= 5 || x < 0 && x > 2의 값은 : "+(y >= 5 || x < 0 && x > 2));
		
		System.out.println("y += 10 - x++의 값 : "+(y += 10 - x++));
		
		System.out.println("x+=2의 값은 : "+(x+=2));
		
		System.out.println("!('A' <= c && c <='Z')의 값 : "+ (!('A' <= c && c <='Z')));
		
		System.out.println("'C'-c의 값 : "+('C'-c));
		
		System.out.println("'5'-'0'의 값 : "+('5'-'0'));
		
		System.out.println("c+1의 값 : "+ (c+1));
		
		System.out.println("++c의 값 : "+ ++c);
		
		System.out.println("c++의 값 : "+c++);
		
		System.out.println("c의 값 : " +c);


	}

}