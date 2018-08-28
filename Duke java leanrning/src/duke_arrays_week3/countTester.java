package duke_arrays_week3;

import java.util.HashMap;

public class countTester {

	public void testCounts() {
		LogAnalyzer la = new LogAnalyzer();
		la.readFile("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week3/WebLogProgram/short-test_log");
		HashMap<String,Integer> counts = la.countVisitsPerIP();
		System.out.println("counts : " + counts);
		
	};
	
	public static void main(String[] args) {
		countTester test = new countTester();
		test.testCounts();

	}

}
