package sec02_exam;

public class ReferenceReturnClass {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		Data d2 = ReferenceReturnClass.copy(d);
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);
		System.out.println("d주소 = "+d);
		System.out.println("d2주소 = "+d2);
	}
	public static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		System.out.println("tmp주소 = " + tmp);
		return tmp;
	}

}
