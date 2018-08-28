package sec_verify08;

public class LoginExample {

	static void login(String id, String pwd) {
	
		System.out.println("아이디는 white이며, 비밀번호는 12345입니다.");
		try {
			if(!id.equals("white")) {
				throw new NotExistIDException(id);
			}
			else if(!pwd.equals("12345")) {
				throw new WrongPasswordException(pwd);
			}
		}
		catch(NotExistIDException | WrongPasswordException e) {
			if(e instanceof NotExistIDException) {
			System.out.println(id +"란 아이디가 존재하지 않습니다.");
			}
			else if(e instanceof WrongPasswordException)
			System.out.println("패스워드가 " + e.getMessage()+"가 아닙니다.");
		}
	 }
	
	public static void main(String[] args) {
		login("white","54321");

	}

}
