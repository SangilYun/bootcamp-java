package sec09_exam_gerneric_implements;

public interface Storage<T> {

	//T라는 제네릭 타입을 저장하는 메서드는 물론, 추상메서드이다. 
	public void add(T item, int index);
	//T를 index로 찾아오는 추상메서드
	public T get(int index);
}
