package sec_verify04;

public class Monitor {

	private String company;
	private int inch;
	
	public Monitor(String c, int i) {
		this.company = c;
		this.inch = i;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
}
