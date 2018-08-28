package duke_arrays_week2_oop;

import edu.duke.*;
import java.util.*;

public class GladLibMap {
	private ArrayList<String> checker = new ArrayList<String>();
	private ArrayList<String> labelUsed = new ArrayList<String>();

	
	HashMap<String,ArrayList<String>> myMap;

	private Random myRandom;
	
	@SuppressWarnings("unused")
	private static String dataSourceURL = "http://dukelearntoprogram.com/course3/data";
	private static String dataSourceDirectory = "/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/course material/GladLib/data";
	
	public GladLibMap(){
		initializeFromSource(dataSourceDirectory);
		myRandom = new Random();
	}
	
	public GladLibMap(String source){
		initializeFromSource(source);
		myRandom = new Random();
	}
	
	private void initializeFromSource(String source) {

		
		myMap = new HashMap<String,ArrayList<String>>();
	
		String[] arr = new String[] {"adjective", "noun", "color", "country", "name"
				, "animal", "timeframe", "verb", "fruit"};
		
		for(int i =0; i<arr.length; i++) {
			myMap.put(arr[i], readIt(source+"/"+arr[i]+".txt"));
		}
	}
	
	private String randomFrom(ArrayList<String> source){
		int index = myRandom.nextInt(source.size());
		return source.get(index);
	}
	
	private String getSubstitute(String label) {
		
		if(myMap.containsKey(label)) {
			return randomFrom(myMap.get(label));
		}
		
		if (label.equals("number")){
			return ""+myRandom.nextInt(50)+5;
		}
		
		return "**UNKNOWN**";
	}
	
	private String processWord(String w){
		
		int first = w.indexOf("<");
		int last = w.indexOf(">",first);
		if (first == -1 || last == -1){
			return w;
		}
		String prefix = w.substring(0,first);
		String suffix = w.substring(last+1);
		String sub = getSubstitute(w.substring(first+1,last));
		
		if(!labelUsed.contains(w.substring(first+1,last))) {
			labelUsed.add(w.substring(first+1,last));
		}
		
		while(checker.contains(sub)) {
			sub = getSubstitute(w.substring(first+1,last));
			System.out.println("duplicated! : " + sub);
		}
		checker.add(sub);
	
		
		return prefix+sub+suffix;
	}
	
	private void printOut(String s, int lineWidth){
		int charsWritten = 0;
		for(String w : s.split("\\s+")){
			if (charsWritten + w.length() > lineWidth){
				System.out.println();
				charsWritten = 0;
			}
			System.out.print(w+" ");
			charsWritten += w.length() + 1;
		}
	}
	
	private String fromTemplate(String source){
		String story = "";
		if (source.startsWith("http")) {
			URLResource resource = new URLResource(source);
			for(String word : resource.words()){
				story = story + processWord(word) + " ";
			}
		}
		else {
			FileResource resource = new FileResource(source);
			for(String word : resource.words()){
				story = story + processWord(word) + " ";
			}
		}
		return story;
	}
	
	private ArrayList<String> readIt(String source){
		ArrayList<String> list = new ArrayList<String>();
		if (source.startsWith("http")) {
			URLResource resource = new URLResource(source);
			for(String line : resource.lines()){
				list.add(line);
			}
		}
		else {
			FileResource resource = new FileResource(source);
			for(String line : resource.lines()){
				list.add(line);
			}
		}
		return list;
	}
	
	public int totalWordsInMap() {
		int sum=0;
		for(String category : myMap.keySet()) {
			sum+= myMap.get(category).size();
		}
		return sum;
	}
	
	public int totalWordsConsidered() {
		int sum =0;
		for(int i=0; i<labelUsed.size();i++) {
			if(!labelUsed.get(i).equals("number")) {
			sum += (myMap.get(labelUsed.get(i))).size();
			}
		}
		return sum;
	}
	
	public void makeStory(){
	    System.out.println("\n");
		String story = fromTemplate("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/course material/GladLib/data/madtemplate2.txt");
		printOut(story, 60);
		System.out.println("\nword replaced : " + checker.size());
		System.out.println("total number of words : " + totalWordsInMap());
		System.out.println("num of words in label used : " + totalWordsConsidered());
	}
	
	public static void main(String[] args) {
		GladLibMap test = new GladLibMap();
		test.makeStory();
	}


}
