package sec_verify03;

public class SmartPhone<C,M,I> {

	private C compnay;
	private M model;
	private I inch;
	
	public SmartPhone(C c, M m, I i) {
		this.compnay = c;
		this.model = m;
		this.inch = i;
	}

	public C getCompnay() {
		return compnay;
	}

	public void setCompnay(C compnay) {
		this.compnay = compnay;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

	public I getInch() {
		return inch;
	}

	public void setInch(I inch) {
		this.inch = inch;
	}
	
}
