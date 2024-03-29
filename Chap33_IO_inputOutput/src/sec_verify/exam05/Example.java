package sec_verify.exam05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {

	public static void main(String[] args) {
		String csvFile = "/Users/yunsangil/Documents/computing/JAVA/Chap33 Input output stream/src/sec_verify/exam05/scoreData";
	    String line = "";
	    String cvsSplitBy = ",";
	    Score score = new Score();
	    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
	        while ((line = br.readLine()) != null) {
	            // use comma as separator
	            String[] stu = line.split(cvsSplitBy);
	            Student st = new Student(stu);
	            score.add(st);
	        }
	    } 
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	    score.display();
	 
	}
}
