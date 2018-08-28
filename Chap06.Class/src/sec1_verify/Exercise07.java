package sec1_verify;

public class Exercise07 {
	String company;
	String model;
	String color;
	int release;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		if(company == "삼성")
			this.company = company;
		else
			System.out.println("삼성폰이 아닙니다.");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if(model =="갤3"||model =="갤4"||model =="갤5"||model =="갤6"||model =="갤7"||model =="갤노")
			this.model = model;
		else
			System.out.println("삼성 모델이 아닙니다.\n (모델 : 갤3~갤7+노트)");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRelease() {
		return release;
	}

	public void setRelease(int release) {
		this.release = release;
	}
	
	@Override
	public String toString() {
		return this.getCompany()+"회사의 "+this.getColor()+"색상의 "+this.getModel()+"모델이며, 출시일은 "+this.getRelease()+"입니다.";
	}

	public void test() {
		Exercise07 t1 = new Exercise07();
		t1.setCompany("sdf");
		t1.setCompany("삼성");
		t1.setColor("white");
		t1.setModel("saefaf");
		t1.setModel("갤5");
		t1.setRelease(2013);
		System.out.println(t1);
	}
	public static void main(String[] args) {
		Exercise07 test = new Exercise07();
		test.test();
	}
}
