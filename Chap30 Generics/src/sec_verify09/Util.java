package sec_verify09;

public class Util {

	//HashMap의 get메서드 처럼 입력받은 key값이 pair의 key값과 일치하면 pair의 value를 리턴해준다. 
		public static <V, K> V getValue(Pair<K,V> p, K key) {
			if((p.getKey()).equals(key)) {
				return p.getValue();
			}
			return null;
		}
	}