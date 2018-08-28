package sec02_verify;

public class MemberServiceExample {
	String id;
	
	boolean login (String id, String password) {
		if(id =="hong" && password == "12345") {
			System.out.println("hong logged in");
			return true;
		}
		else {
			System.out.println("ID/Password를 확인해주세요");
			return false;
		}
	}
	
	void logout(String id) {
		if(id == "hong") {
			System.out.println("hong logged out");
		}
		
	}
	public static void main(String[] args) {
		MemberServiceExample test = new MemberServiceExample();
		test.login("hong", "12345");
		test.logout("hong");
		test.login("radf", "23232");

	}

}
