package sec_verify02;

public class Monitor {
	
	private String model;
	private int inch;
	private int price;
	
	public Monitor(String m, int i, int p) {
		this.model = m;
		this.inch = i;
		this.price = p;
	} 
	
	public int hashCode() {
		return this.price;
	}
}
