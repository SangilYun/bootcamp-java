package sec01_list.exam01_ArrayList;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		 //ArrayList는 원래 제네릭 타입이다. 그래서 Warning이 뜬다.
		
		ArrayList list = new ArrayList(); //기본적으로 방 10개 생성함
		
		//System.out.println(list.ensureCapacity());
		
		System.out.println("총 크기 : " + list.size());
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("222");
		
		//add(new Integer(333)); JDK 1.5부터 추가된 자동박싱기능 이용(래퍼클래스)
		list.add(333);
		
		System.out.println("총 크기 : " + list.size()); //length랑 size는 다르다.
		//size는 객체의 갯수. 기본적으로 10개 방이 생성되지만 다 null로 되있기 때문에 이때는 0이나옴.
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//0번째 인덱스에 새로 값을 넣으면 기존의 값들은 뒤로 밀려나게 된다. 
		list.add(0,"333");
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//앞에서 부터 검색하여 "333"을 삭제한다. (가까운 것만 한개 삭제)
		//boolean remove(Object o)
		list.remove("333");
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		System.out.println(list.remove("333"));
		
		//기본적으로 10개의 방을 넘어서면 또다시 10개의 방을 만든다.
		/*list.addAll("111");
		 *list.addAll("111");
		 *list.addAll("111");
		 *list.addAll("111");
		 *list.addAll("111");
		 *list.addAll("111");
		 *list.addAll("111");
 		 *list.addAll("111");
		 *list.addAll("111");
		 *list.addAll("111");
		 *System.out.println("총 크기 : " + list.size());
		 */
		
		//ArrayList의 각 인덱스의 값 저장(set(index, Object)이용
		for(int i=0; i<list.size(); i++) {
			list.set(i, i+"");
		}
		
		//ArrayList의 각 인덱스의 값 출력(get(index)이용)
		for(int i=0; i<list.size(); i++) {
			list.remove(i);
		}
		//System.out.println(list);
		
		//다 삭제를 했음에도 불구하고 1,3이 남아 있다. 
		//for loop을 하는데 remove하면 list.size()가 계속 변해서 인덱스가 바뀜 
		System.out.println(list);
		
		//아래와 같이 삭제를 하면 ArrayIndexoutofBoundsException이 발생한다. 
//		for(int i=list.size(); i>=0; i--) {
//			list.remove(i);
//		}
//		System.out.println(list);
		
		//배열은 0부터 시작되는 것을 알고 있다.
		//그래서 아래와 같이 해줘야 예외가 발생하지 않는다. 
		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		System.out.println(list);
	}

}
