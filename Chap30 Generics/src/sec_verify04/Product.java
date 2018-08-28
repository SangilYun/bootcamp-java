package sec_verify04;

public class Product<A,M,I> {

	private A a;
	private M m;
	private I i;
	
	public Product(A a, M m, I i) {
		this.a =a;
		this.m =m;
		this.i = i;
	}

	public I getI() {
		return i;
	}

	public void setI(I i) {
		this.i = i;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public M getM() {
		return m;
	}

	public void setM(M m) {
		this.m = m;
	}
}
