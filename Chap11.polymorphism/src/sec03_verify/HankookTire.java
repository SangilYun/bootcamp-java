package sec03_verify;

public class HankookTire extends Tire{

	public HankookTire(String location , int maxRotation) {
		super(location, maxRotation);
		this.accumulateRotation =0;
	}
	
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : " + 
					(maxRotation-accumulateRotation) +"회");
			return true;
		}
		else {
			System.out.println("***  "+this.location + "HankookTire 펑크  ***");
			return false;
		}
	}
}
