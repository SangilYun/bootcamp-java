package sec01_vertify;

public class LiteralExample {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 8;
		int var3 = 0x10;
		String hex = Integer.toString(var1,10);
		String decimal = Integer.toString(var2,8);
		String octal = Integer.toString(var3,10);

		System.out.println(hex);
		System.out.println(decimal);
		System.out.println(octal);

	}

}
