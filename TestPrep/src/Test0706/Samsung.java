package Test0706;

public class Samsung {

	String company;
	String model;
	String color;
	int release;
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		if(company.equals("삼성"))
			this.company = company;
		else
			System.out.println("no");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if(model.equals("갤3"))
		this.model = model;
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

	public static void main(String[] args) {
		
		Samsung test = new Samsung();
		test.setCompany("삼성");
		System.out.println(test.getCompany());
		String test2 = "삼성";
		String test3 = new String("삼성");
		String test4 = "삼성";
		
		System.out.println(test2 == test3);
		System.out.println(test2.equals(test3));
		System.out.println(test2 == test4);
		
	}

}
