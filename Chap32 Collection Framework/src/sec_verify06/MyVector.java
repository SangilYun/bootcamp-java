package sec_verify06;

public class MyVector {
	Object[] data = null;
	private int capacity =0;
	private int size =0;
	
	public MyVector(int capacity) {
		this.capacity = capacity;
		data = new Object[this.capacity];
	}
	
	public MyVector() {
		this(10);
	}

	public boolean isEmpty() {
		if(this.size ==0)
			return true;
		else 
			return false;
	}
	
	public int capacity() {
		return this.capacity;
	}
	
	public int size() {
		return this.size;
	}
	
	public void ensureCapacity(int minCapacity) {
		this.setCapacity(minCapacity);
		Object[] oldData = this.data;
		this.data = new Object[this.capacity];
		System.arraycopy(oldData, 0, this.data, 0, oldData.length);
	}
	
	public boolean add(Object obj) {
		boolean flag = true;
		if(this.capacity == this.size) {
			System.out.println("저장 공간을 늘립니다.");
			int minCapacity = this.size+10;	//10씩 추가
			ensureCapacity(minCapacity);
			flag = false;
		}
			data[size] = obj;
			size++;
			return flag;
	}
	
	public Object get(int index) {
		return data[index];
	}
	
	public Object remove(int index) {
		Object[] oldData = this.data;
		this.data = new Object[size-1];
		System.arraycopy(oldData, 0, this.data, 0, index);//index왼쪽 배열 복사
		System.arraycopy(oldData, index+1, this.data, index, size-index-1);//index오른쪽 배열 복사
		size--;
		return oldData[index];
	}
	
	public boolean remove(Object obj) {
		int index=-1;
		for(int i=0; i<size; i++) {
			System.out.println("스트링? " + (obj instanceof String));
			if(obj instanceof String?obj.equals(data[i]):obj==data[i]) {
				index =i;
				break;
			}
		}
		if(index ==-1) {
			return false;
		}
		else {
			remove(index);
			return true;
		}
	}
	
	private void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void clear() {
		this.size =0;
		this.capacity = 10;
		data = new Object[this.capacity];
	}
	
	public String toString() {
		String str="";
		str += "[";
		for(int i=0; i<this.size;i++) {
			str+= this.data[i];
			if(i!=this.size-1) {
				str+=",";
			}
		}
		str += "]";
		return str;
	}
}
