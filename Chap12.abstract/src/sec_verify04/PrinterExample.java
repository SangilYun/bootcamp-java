package sec_verify04;

public class PrinterExample {

	public static void main(String[] args) {
		InkjetPrinter ip = new InkjetPrinter("Officejet V40", "HP", 0,5,10);
		LaserPrinter lp = new LaserPrinter("SCX-6x45", "삼성전자", 0, 3, 20);
		
		for(int i=0; i<5 ; i++) {
			lp.print();
			ip.print();
		}

	}

}
