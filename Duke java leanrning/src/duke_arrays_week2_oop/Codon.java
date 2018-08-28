package duke_arrays_week2_oop;

import java.util.HashMap;

import edu.duke.FileResource;

public class Codon {

	HashMap<String,Integer> map;
	
	public Codon() {
		map = new HashMap<String,Integer>();
	}
	
	public void buildCodonMap(int start, String dna) {
		map.clear();
		while(start<dna.length()-2) {		
			String codon = dna.substring(start, start+3);
			if(map.containsKey(codon)) {
				map.put(codon, map.get(codon)+1);
			}
			else {
				map.put(codon, 1);
			}
			start += 3;
		}
		for(String k : map.keySet()) {	//printing
			System.out.println(k + " " + map.get(k));
		}
	}
	
	public String getMostCommonCodon() {
		String maxCodon = null;
		int maxCount=0;
		for(String s : map.keySet()) {
			if (map.get(s)>maxCount) {
				maxCount = map.get(s);
				maxCodon = s;
			}
		}
		System.out.print("Max count : " +maxCount + " ");
		return maxCodon;
	}
	
	public void printCodonCounts(int start, int end) {
		for(String s : map.keySet()) {
			if(map.get(s)>= start && map.get(s)<= end) {
				System.out.println(s + " " +map.get(s));
			}
		}
	}
	
	public void test() {
		FileResource fr = new FileResource();
		String dna = fr.asString();
//		String dna = "CGTTCAAGTTCAA,";
		buildCodonMap(0, dna);
		System.out.println("0.most common : "+getMostCommonCodon());
		buildCodonMap(1, dna);
		System.out.println("1.most common : "+getMostCommonCodon());
		buildCodonMap(2, dna);
		System.out.println("1.most common : "+getMostCommonCodon());
		printCodonCounts(4,4);
		
	}
	
	public static void main(String[] args) {
		Codon test = new Codon();
//		test.buildCodonMap(0, "CGTTCAAGTTCAA");
//		System.out.println();
//		test.buildCodonMap(1, "CGTTCAAGTTCAA");
//		System.out.println();
//		test.buildCodonMap(2, "CGTTCAAGTTCAA");
//		System.out.println(test.getMostCommonCodon());
		test.test();
	}
}
