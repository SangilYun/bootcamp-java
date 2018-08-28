package duke_arrays_week2;

import java.util.HashMap;

import edu.duke.FileResource;

public class WordFrequenciesMap {

	public void countWords() {
		FileResource fr = new FileResource();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
 		for(String w : fr.words()) {
			w = w.toLowerCase();
			if(map.keySet().contains(w)) {	//is it in my keySet?
				map.put(w, map.get(w)+1);
			}
			else {
				map.put(w,1);
			}
		}
		for(String w : map.keySet()) {
			int occurrences = map.get(w);
			if(occurrences > 200) {
				System.out.println(occurrences + "\t" + w);
			}
		}
	}
	public static void main(String[] args) {
		WordFrequenciesMap test = new WordFrequenciesMap();
		test.countWords();
	}
}
