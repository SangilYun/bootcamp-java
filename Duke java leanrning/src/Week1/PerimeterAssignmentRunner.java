
package Week1;
import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        edu.duke.Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (edu.duke.Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int sum = 0;
        for(@SuppressWarnings("unused") edu.duke.Point each:s.getPoints()){
        	sum ++ ;
        }
        
        return sum;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        double length = getPerimeter(s);
        double numSides = (double) getNumPoints(s);
        double avgLength = length / numSides;
       
        
        return avgLength;
    }

    public double getLargestSide(Shape s) {
        // Put code here
    	double distance =0;
    	edu.duke.Point prevPt = s.getLastPoint();
    	for (edu.duke.Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            if(distance<=currDist) {
            	distance = currDist;
            }
    	}
        return distance;
    }

    public double getLargestX(Shape s) {
        // Put code here
    	int xvalue=0;
    	for(edu.duke.Point each : s.getPoints()) {
    		if(xvalue<=each.getX()) {
    			xvalue = each.getX();
    		}
    	}
        return xvalue;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
    	double largestPeri=0.0;
    	DirectoryResource dr = new DirectoryResource();
    	for(File f: dr.selectedFiles()) {
    		FileResource fr = new FileResource(f);
    		Shape s = new Shape(fr);
    		double currPeri=getPerimeter(s);
    		if(currPeri >= largestPeri) {
    			largestPeri=currPeri;
    		}
    	}
        return largestPeri;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
    	double largestPeri=0.0;

        DirectoryResource dr = new DirectoryResource();
    	for(File f: dr.selectedFiles()) {
    		FileResource fr = new FileResource(f);
    		Shape s = new Shape(fr);
    		double currPeri=getPerimeter(s);
    		if(currPeri >= largestPeri) {
    			largestPeri=currPeri;
    			temp = f;
    		}
    	}
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        double num_point = getNumPoints(s);
        double largest = getLargestSide(s);
        double largestX = getLargestX(s);
        
        System.out.println("perimeter = " + length);
        System.out.println("num_point = " + num_point);
        System.out.println("largest = " + largest);
        System.out.println("largestX = " + largestX);
        System.out.println("in multipleFiles = "+getLargestPerimeterMultipleFiles());
        System.out.println("in multipleFiles = "+getFileWithLargestPerimeter());

    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
    	System.out.println("Largest perimeter is : "+getLargestPerimeterMultipleFiles());
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    	System.out.println("File : "+ getFileWithLargestPerimeter());
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
    	Shape triangle = new Shape();
        triangle.addPoint(new edu.duke.Point(0,0));
        triangle.addPoint(new edu.duke.Point(6,0));
        triangle.addPoint(new edu.duke.Point(3,6));
        for (edu.duke.Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        @SuppressWarnings("unused")
		DirectoryResource dr = new DirectoryResource();
    }
    

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();

        
//        Shape s = new edu.duke.Shape();
//        edu.duke.Point p1 = new edu.duke.Point(3,1);
//        edu.duke.Point p2 = new edu.duke.Point(3,2);
//        s.addPoint(p1);
//        s.addPoint(p2);
//        System.out.println(s.getPoints());
//        for(edu.duke.Point each : s.getPoints()) {
//        	System.out.println(each.getX());
//        	
//        }        
//        System.out.println(getNumPoints(s));
//        
//        
    }
}

