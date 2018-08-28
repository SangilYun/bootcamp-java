package sec_verify01;

import java.util.Comparator;

public class CarComparator implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		if(o1.model.equals(o2.model)) {
			System.out.println();
			return 0;
		}
		else {
			return 1;
		}
	}
}
