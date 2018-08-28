package Week1;
import edu.duke.*;


public class PerimeterRunner {
	public double getPerimeter(Shape s) {
		double totalPerim = 0;
		edu.duke.Point prevPt = s.getLastPoint();
		for(edu.duke.Point currPt : s.getPoints()){
            // Find distance from prevPt point to currPt 
            double currDist = currPt.distance(prevPt);
            // Update totalPerim by currDist
            totalPerim += currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
	}

	
	public static void main(String[] args) {
		
	}

}
