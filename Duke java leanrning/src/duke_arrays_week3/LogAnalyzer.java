package duke_arrays_week3;

import java.util.*;
import edu.duke.*;

public class LogAnalyzer
{
     private ArrayList<LogEntry> records;
 	 

     public LogAnalyzer() {
         // complete constructor
    	 records = new ArrayList<LogEntry>();	  
     }
        
     public void readFile(String filename) {
         // complete method
    	 FileResource fr = new FileResource(filename);
    	 for(String line : fr.lines()) {
//    		 System.out.println("testing");
    		 LogEntry logEntry = WebLogParser.parseEntry(line);
    		 records.add(logEntry);
    	 }
     }
        
     public void printAll() {
         for (LogEntry le : records) {
             System.out.println(le);
         }
     }
     
     public int countUniqueIps() {
    	 //uniqueIps starts as an empty list
    	 ArrayList<String> uniqueIPs = new ArrayList<String>();
    	 //for each element le in records{
    	 for(LogEntry le : records) {
    	 //ipAddr is le's ipAddress
    	 	String ipAddr = le.getIpAddress();
    	 //if ipAddr is not in uniqueIPs{
    	 	if(!uniqueIPs.contains(ipAddr)) {
    	 	//add ipAddr to uniqueIPs
    	 		uniqueIPs.add(ipAddr);
    	 	}
    	 }
    	 //return the size of uniqueIPs
    	 	return uniqueIPs.size();
     }
     
     public void printAllHigherThanNum(int num) {
    	 for(LogEntry each : records) {
    		 int status = each.getStatusCode();
    		 if(status > num) {
    			 System.out.println(each);
    		 }
    	 }
     }
     
     public void uniqueIPVisitsOnDay(String someday) {
    	 ArrayList<String> arr = new ArrayList<String>();
    	 for(LogEntry le : records) {
    		 String ipAddr = le.getIpAddress();
    		 if(le.getAccessTime().toString().contains(someday)&& !arr.contains(ipAddr)) {
    			 arr.add(ipAddr);
    		 }
    	 }
    	 System.out.println(arr);
    	 //add for the quiz
    	 System.out.println("size of arraylist on this particular date : " +arr.size());
     }
     
     public int countUniqueIPsInRange(int low , int high) {
    	 ArrayList<String> arr = new ArrayList<String>();
    	 for(LogEntry le : records) {
    		 if(le.getStatusCode()>= low && le.getStatusCode()<= high && !arr.contains(le.getIpAddress())) {
    			 arr.add(le.getIpAddress());
    		 }
    	 }
    	 return arr.size();
     }
     
     public HashMap<String,Integer> countVisitsPerIP(){
    	 //Make an empty HashMap<String,Integer> counts
    	 HashMap<String,Integer> counts = new HashMap<String,Integer>();
    	 //For each le in records
    	 for(LogEntry le : records) {
    	 	//ip is le's ipAddress
    		 String ip = le.getIpAddress();
    	 	//check if ip is in counts
    		 if(!counts.containsKey(ip)) {
    	 		//if not: put ip in with a value of 1
    			 counts.put(ip, 1);
    		 }
    		 else {
    			 counts.put(ip, counts.get(ip)+1);
    		 }
    	 }
    	 return counts;
     }
     
     public int mostNumberVisitsByIP(HashMap<String,Integer> map) {
    	 int maxNum = 0;
    	 for(String each : map.keySet()) {
    		 if(map.get(each) > maxNum) {
    			 maxNum = map.get(each);
    			 }
    	 }
    	 
    	 return maxNum;
     }
     
     public ArrayList<String> iPsMostVisits(HashMap<String,Integer> map){
    	 int maxNum = mostNumberVisitsByIP(map);
    	 ArrayList<String> arr = new ArrayList<String>();
    	 for(String each : map.keySet()) {
    		 if(map.get(each) == maxNum) {
    			 arr.add(each);
    		 }
    	 }
    	 return arr;
     }
     
     public HashMap<String, ArrayList<String>> iPsForDays(){
    	 HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
    	 for(LogEntry le : records) {
    		 if(!map.containsKey(le.getAccessTime().toString().substring(4, 10))) {
    			 ArrayList<String> IPs = new ArrayList<String>();
    			 IPs.add(le.getIpAddress());
    			 map.put(le.getAccessTime().toString().substring(4, 10), IPs);
    		 }
    		 else {
    			 map.get(le.getAccessTime().toString().substring(4, 10)).add(le.getIpAddress());
    		 }
    	 }
    	 return map;
     }
     
     public String dayWithMostIPVisits(HashMap<String, ArrayList<String>> map) {
    	 int maxNum = 0;
    	 String maxDay = "";
    	 for(String each : map.keySet()) {
    		 if(map.get(each).size() > maxNum) {
    			 maxNum = map.get(each).size();
    			 maxDay = each;
    		 }
    	 }
    	 return maxDay;
     }
     
     public ArrayList<String> iPsWithMostVisitsOnDay(HashMap<String, ArrayList<String>> map , String date){
    	 HashMap<String,Integer> iPCounter = new HashMap<String,Integer>();
    	 for(String each : map.get(date)) {
    		if(!iPCounter.containsKey(each)) {
    			iPCounter.put(each, 1);
    		}
    		else {
    			iPCounter.put(each, iPCounter.get(each)+1);
    		}
    	}
    	 int maxNum = 0;
    	 ArrayList<String> maxIP = new ArrayList<String>();
    	 for(String each : iPCounter.keySet()) {
    		 if(iPCounter.get(each) >= maxNum ) {
    			 maxNum = iPCounter.get(each);
    		 }
    	 }
    	 for(String each : iPCounter.keySet()) {
    		 if(iPCounter.get(each) >= maxNum) {
    			 maxIP.add(each);
    		 }
    	 }
    	 return maxIP;
     }
     
     static public void main(String args[]) {
    	 //quiz
    	 LogAnalyzer test = new LogAnalyzer();
    	 test.readFile("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week3/WebLogProgram/weblog1_log");
//    	 test.printAllHigherThanNum(400);
//    	 test.uniqueIPVisitsOnDay("Mar 17");
    	 System.out.println(test.countUniqueIPsInRange(300,399));

     } 
}
