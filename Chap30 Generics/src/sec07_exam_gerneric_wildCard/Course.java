package sec07_exam_gerneric_wildCard;


//과정(Course)을 수강할 수 있는 대상을 제네릭타입(T)로 선언함.
//아울러 어떤 대상이 수강을 할지 아무도 모르는 상태임을 나타냄.

public class Course<T> {

	private String name;	//과정명(ex. 국어, 수학, 토익 등..)
	private T[] students; 	//과정당 들을 수 있는 수강생 수

	//생성자
	public Course(String name, int capacity){
		this.name = name;
		//이거 안된다. 아직 T타입이 결정 안되었는데 배열을 어떻게 만드는가?
		//this.student = new T[capacity];
		//이부분 필히 보고 숙지를 해야한다. 이런 코드 자주 등장
		this.students = (T[])(new Object[capacity]);
	}
	
	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		//비어있는 공간에 수강생을 추가하기 위한 코드
		for(int i=0;i<this.students.length; i++) {
			if(students[i]==null) {
				students[i]=t;
				break;
			}
		}
	}
}
