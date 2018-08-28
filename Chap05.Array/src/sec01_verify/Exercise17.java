package sec01_verify;

import java.util.HashSet;
import java.util.Set;

public class Exercise17 {

	public static void main(String[] args) {
		double[] arr=new double[]{1.1, 2.2, 6.6, 4.4, 5.5, 4.4, 3.3, 4.4, 2.2, 3.3};
		Set<Double> set = new HashSet<Double>();	
		
		for (double num : arr) {	//array값을 set에 저장해 중복값을 없앰.
		    set.add(num);
		}
		System.out.println(set);
	}

}
