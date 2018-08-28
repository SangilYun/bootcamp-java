package sec_verify02;

public class Member {
	
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Member의 toString()을 호출한 결과 : " + this.id + " : " + this.name;
	}

}
