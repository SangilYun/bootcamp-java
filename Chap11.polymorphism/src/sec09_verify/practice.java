package sec09_verify;

public class practice {

	public String reverse(String s) {
		return s.length()<=1 ? s :reverse(s.substring(1)) + s.charAt(0);
	}
	
	public static void main(String[] args) {
		practice test = new practice();
		
		String str = test.reverse("abcdefg");
		String str2 = test.reverse("a");
		String str3 = test.reverse("");

		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);

	}
}
