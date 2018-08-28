package sec01_exam_objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		 
		Integer o1 = new Integer(1000); //Integer o1 = 1000; 해도 됨. 자동 박싱
		Integer o2 = new Integer(1000);
		
		//o1.equals(o2) --> Object 의 equals를 오버라이딩 되어 있다.
		//Wrapper 객체들은 전부 equals()가 오버라이딩 되어 있다.
		System.out.println(o1.equals(o2));
		
		//위와 같이 기준이 되는 객체와 비교가 되는 객체를 분리해놓은 형태이다.
		//그렇게 되면 유지보수 측면에서 상당히 유리할 것이다.
		
		//Object의 equals와 동일한데 여기서는 비교대상 근본이 Integer임을 명심하자.
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2)+"\n");

		Integer[] arr1 = {new Integer(1), new Integer(2) };
		Integer[] arr2 = {1,2}; //2개의 클래스가 저장되어 있는 형태
		System.out.println(Objects.equals(arr1, arr2));//주소값, false
		System.out.println(Objects.deepEquals(arr1, arr2));//안에 있는 값을 비
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}

}
