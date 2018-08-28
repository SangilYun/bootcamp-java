package duke_arrays_week3;

import java.util.*;

public class Tester
{
    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
     // this will printout its address location without toString method overridden.
//        System.out.println(le);
        System.out.println(le);
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }
    
    public void testLogAnalyzer() {
//    	testLogEntry();
    	LogAnalyzer logAnalyzer = new LogAnalyzer();
    	logAnalyzer.readFile("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week3/WebLogProgram/short-test_log");
    	logAnalyzer.printAll();
    	
    }
    
    public void testuniqueIPVisitsOnDay() {
    	LogAnalyzer la = new LogAnalyzer();
		la.readFile("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week3/WebLogProgram/weblog-short_log");
//		la.uniqueIPVisitsOnDay("Sep 14");
		la.uniqueIPVisitsOnDay("Sep 30");
	
    }
    
    public void testcountUniqueIPsInRange() {
    	LogAnalyzer la = new LogAnalyzer();
		la.readFile("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week3/WebLogProgram/short-test_log");
		int range = la.countUniqueIPsInRange(300, 399);
		System.out.println(range);
    }
    
    public void testmostNumberVisitsByIP() {
    	LogAnalyzer la = new LogAnalyzer();
		la.readFile("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week3/WebLogProgram/weblog3-short_log");
		HashMap<String,Integer> test = la.countVisitsPerIP();
		System.out.println(la.mostNumberVisitsByIP(test));

    }
    
    public void testIPsMostVisits() {
    	LogAnalyzer la = new LogAnalyzer();
		la.readFile("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week3/WebLogProgram/weblog3-short_log");
		HashMap<String,Integer> test = la.countVisitsPerIP();
		System.out.println(la.iPsMostVisits(test));
    }
    
    public void testiPsForDays() {
    	LogAnalyzer la = new LogAnalyzer();
		la.readFile("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week3/WebLogProgram/weblog3-short_log");
		HashMap<String, ArrayList<String>> test = la.iPsForDays();
		System.out.println(test);
    }
    
    public void testdayWithMostIPVisits() {
    	LogAnalyzer la = new LogAnalyzer();
		la.readFile("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week3/WebLogProgram/weblog3-short_log");
		HashMap<String,ArrayList<String>> test = la.iPsForDays();
		System.out.println(la.dayWithMostIPVisits(test));
    }
    
    public void testiPsWithMostVisitsOnDay() {
    	LogAnalyzer la = new LogAnalyzer();
		la.readFile("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week3/WebLogProgram/weblog3-short_log");
		HashMap<String,ArrayList<String>> test = la.iPsForDays();
    	System.out.println(la.iPsWithMostVisitsOnDay(test , "Sep 30"));
    }
    
    //quiz
    public void quiz() {
    	LogAnalyzer la = new LogAnalyzer();
    	la.readFile("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week3/WebLogProgram/weblog1_log");
//    	HashMap<String,Integer> test = la.countVisitsPerIP();
//    	System.out.println("quiz1 : "+la.mostNumberVisitsByIP(test));
//    	System.out.println("quiz2 : "+la.iPsMostVisits(test));
    	HashMap<String, ArrayList<String>> test2 = la.iPsForDays();
//    	System.out.println("quiz3 : " + la.dayWithMostIPVisits(test2));
    	System.out.println("quiz4 : " + la.iPsWithMostVisitsOnDay(test2, "Mar 17"));

    	
    	

    }
    
    
    public static void main(String args[]) {
    	Tester test = new Tester();
//    	test.testLogAnalyzer();
//    	test.testuniqueIPVisitsOnDay();
//    	test.testcountUniqueIPsInRange();
//    	test.testmostNumberVisitsByIP();
//    	test.testIPsMostVisits();
//    	test.testiPsForDays();
//    	test.testdayWithMostIPVisits();
//    	test.testiPsWithMostVisitsOnDay();
    	test.quiz();
    }
}
