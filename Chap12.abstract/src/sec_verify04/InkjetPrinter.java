package sec_verify04;

public class InkjetPrinter extends Printer{

	static final int amountOfInkToPrint = 5;
	private int amountOfInt;
	
	public InkjetPrinter(String modelName, String manufacturer, int numberOfPrinted, int numberOfPaper, int amountOfInk) {
		super(modelName,manufacturer,numberOfPrinted,numberOfPaper);
		this.amountOfInt = amountOfInk;
	}
	
	public int getAmountOfInk() {
		return amountOfInt;
	}
	
	@Override
	public void print() {
		if(numberOfPaper > 0 && amountOfInt > 0) {
			System.out.println("잉크젯 프린트 출력");
			if(numberOfPaper > 0) {
				setNumberOfPaper(getNumberOfPaper()-1);
			}
			if(amountOfInt > 0) {
				this.amountOfInt -= amountOfInkToPrint;
			}
			this.numberOfPrinted++;

		}
		else {
			if(numberOfPaper <= 0) {
				System.out.println("종이가 부족합니다.");
			}
			else if(amountOfInt <=0) {
				System.out.println("잉크가 부족합니다.");
			}
		}
		System.out.println("제조사 : " + this.getManufacturer() + "\n모델명 : " + this.getModelName()
		+ "\n잉크젯 프린터 >> 인쇄용지 : " + this.numberOfPaper + " 출력매수 : "+this.numberOfPrinted + " 잉잔량 : " + this.amountOfInt+"\n");
	}
}
