package sec_verify01;

import java.util.Objects;

public class CarComparatorExample {

	public static void main(String[] args) {
		Car c1 = new Car("SM5-신형",4);
		Car c2 = new Car("SM7-신형",4);
		Car c3 = new Car("SM5-신형",4);

		if(Objects.compare(c1, c2, new CarComparator()) == 1 )
			System.out.println("c1 과 c2는 다른 차종입니다.");

		if(Objects.compare(c1, c3, new CarComparator()) != 1 )
			System.out.println("c1 과 c2는 같은 차종입니다.");
	}
}
