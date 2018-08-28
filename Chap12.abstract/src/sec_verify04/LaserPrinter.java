package sec_verify04;

public class LaserPrinter extends Printer {

	static final int amountOfTonerToPrint = 10;
	private int amountOfToner;
	
	public LaserPrinter(String modelName, String manufacturer, int numberOfPrinted, int numberOfPaper, int amountOfToner) {
		super(modelName,manufacturer,numberOfPrinted,numberOfPaper);
		this.amountOfToner = amountOfToner;	
	}
	
	public int getAmountOfToner() {
		return this.amountOfToner;
	}
	
	@Override
	public void print() {
		if(numberOfPaper > 0 && amountOfToner > 0) {
			System.out.println("레이저 프린트 출력");
			if(numberOfPaper > 0) {
				setNumberOfPaper(getNumberOfPaper()-1);
			}
			if(amountOfToner > 0) {
				this.amountOfToner -= amountOfTonerToPrint;
			}
			this.numberOfPrinted++;

		}
		else {
			if(numberOfPaper <= 0) {
				System.out.println("종이가 부족합니다.");
			}
			else if(amountOfToner <=0) {
				System.out.println("토너가 부족합니다.");
			}
		}
		System.out.println("제조사 : " + this.getManufacturer() + "\n모델명 : " + this.getModelName()
		+ "\n레이저 프린터 >> 인쇄용지 : " + this.numberOfPaper + " 출력매수 : "+this.numberOfPrinted + " 토너잔량 : " + this.amountOfToner+"\n");
		
	}
}
