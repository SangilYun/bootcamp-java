package sec_verify04;

public abstract class Printer {

	static int USB;
	static int PARALLEL;
	private String modelName;
	private String manufacturer;
	protected int numberOfPrinted;
	protected int numberOfPaper;
	
	public Printer(String modelName, String manufacturer, int numberOfPrinted, int numberOfPaper) {
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.numberOfPrinted = numberOfPrinted;
		this.numberOfPaper = numberOfPaper;
	}

	public int getNumberOfPaper() {
		return numberOfPaper;
	}

	public void setNumberOfPaper(int numberOfPaper) {
		this.numberOfPaper = numberOfPaper;
	}

	public String getModelName() {
		return modelName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getNumberOfPrinted() {
		return numberOfPrinted;
	}
	
	abstract public void print();
	
}
