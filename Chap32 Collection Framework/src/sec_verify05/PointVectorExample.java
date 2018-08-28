package sec_verify05;

import java.util.Vector;

public class PointVectorExample {

	public static void main(String[] args) {
		
		Point p1 = new Point(2,3);
		Point p2 = new Point(-5,20);
		Point p3 = new Point(30,-8);
		
		Vector<Point> v = new Vector<Point>();
		v.add(p1);
		v.add(p2);
		v.add(p3);
		for(Point each : v) {
			System.out.println(each);
		}
	}
}
