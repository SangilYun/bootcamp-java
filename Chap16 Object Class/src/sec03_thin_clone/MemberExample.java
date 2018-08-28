package sec03_thin_clone;

public class MemberExample {

	public static void main(String[] args) {
		 
		Member original = new Member("blue","hong","12345",25,true,new int[] {90,100});
		
		//통상적으로 원본객체의 보존을 위해 clone을 해서 복제객체를 통해 작업을 많이 한다.
		Member cloned = original.getMember(); //얕은 복제된 인스턴스를 가지고 옴.
		
		cloned.password = "678910"; //복제 객체의 password값을 변경하면 복제 객체에만
									//영향을 끼친다. 기본타입은 객체를 메모리를 갖는다. 
		cloned.scores[0] = 88; 		//얕은 복제에서는 참조형 타입은 번지만 공유를 한다.
		
		System.out.println("[원본 객체의 필드 값]");
		System.out.println("id : " + original.id);
		System.out.println("name : " + original.name);
		System.out.println("password : " + original.password);
		System.out.println("age : " + original.age);
		System.out.println("adult : " + original.adult);
		System.out.println("원본 배열 주소 : " + original.scores.toString());
		System.out.print("scores : {");
		
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1)) ? "" : ",");
		}
		System.out.println("}");
		
		System.out.println("[복제 객체의필드 값]");
		System.out.println("id : " + cloned.id);
		System.out.println("name : " + cloned.name);
		System.out.println("password : " + cloned.password);
		System.out.println("age : " + cloned.age);
		System.out.println("adult : " + cloned.adult);
		System.out.println("복사 배열 주소 : " + cloned.scores.toString());
		System.out.print("scores : {");
		
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1)) ? "" : ",");
		}
		System.out.println("}");
	}

}
