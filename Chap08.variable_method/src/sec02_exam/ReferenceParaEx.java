package sec02_exam;

//c에서의 Call By Reference를 의미함.
public class ReferenceParaEx {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2};
		System.out.println(arr[1]);
		arr_change(arr);
		System.out.println(arr[1]);

		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = "+d.x);
	}
	//참조형 매개변수
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
	
	static void arr_change(int[] arr) {
		arr[1] = 10;
		System.out.println(arr[1]);
	}
}
