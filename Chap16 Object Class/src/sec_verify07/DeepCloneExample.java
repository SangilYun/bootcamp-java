package sec_verify07;

public class DeepCloneExample {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10,10,-5,-5);
		rec.showPosition();
		
		Rectangle cloned = (Rectangle) rec.clone();
		
		cloned.changePos(2, 2, 7, 7);
		cloned.showPosition();
	}

}
