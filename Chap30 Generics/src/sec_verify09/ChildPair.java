package sec_verify09;

public class ChildPair<K,V> extends Pair{

	private K key;
	private V value;
	
	public ChildPair(K key, V value) {
		super(key,value);
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}
