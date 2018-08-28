package Week1;

//import edu.duke.*;


public class Point{
	private int x;
	private int y;
	
public Point(int startx, int starty){
    x = startx;
    y = starty;
}
public int getX() {return x;}
public int getY() {return y;}

public double distance(Point otherPT){
int dx = x - otherPT.getX();
int dy = y - otherPT.getY();
return Math.sqrt(dx*dx + dy*dy);
}


public static void main(String[] args) {
		Point p1 = new Point(3,4);
		Point p2 = new Point(6,8);
		System.out.println(p1.distance(p2));

	}

}
