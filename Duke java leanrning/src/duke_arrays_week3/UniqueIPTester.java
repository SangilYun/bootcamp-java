package duke_arrays_week3;

public class UniqueIPTester {

	public void testUniqIP() {
		LogAnalyzer la = new LogAnalyzer();
		la.readFile("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week3/WebLogProgram/short-test_log");
		int uniqueIPs = la.countUniqueIps();
		System.out.println("There are " + uniqueIPs + "IPs");
	}
	public static void main(String[] args) {
		UniqueIPTester test = new UniqueIPTester();
		test.testUniqIP();
	}

}
