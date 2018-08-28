package duke_arrays_week2_oop;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import edu.duke.DirectoryResource;
import edu.duke.FileResource;

public class WordsInFiles {

	HashMap<String,ArrayList<String>> map; 
	
	public WordsInFiles() {
		map = new HashMap<String,ArrayList<String>>();
	}
	
	private void addWordsFromFile(File f) {
		FileResource fr = new FileResource(f);
		for(String word : fr.words()) {
			if(!map.containsKey(word)) {
				map.put(word, new ArrayList<String>(Arrays.asList(f.getName())));
			}
			else {
				ArrayList<String> temp = map.get(word);
				if(!temp.contains((f.getName()))) { //prevent key has duplicated file
					temp.add(f.getName());
				}
			}
		}
		for(String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
		System.out.println();
	}
	
	public void buildWordFileMap() {
		DirectoryResource dr = new DirectoryResource();
		for(File f : dr.selectedFiles()) {
			addWordsFromFile(f);
		}
	}
	
	public int maxNumber() {
		int maxNum = 0;
		for(String key : map.keySet()) {
			if(map.get(key).size() >= maxNum) {
				maxNum = map.get(key).size();
			}
		}
		return maxNum;
	} 
	
	public ArrayList<String> wordsInNumFiles(int number) {
		ArrayList<String> arrList = new ArrayList<String>();
		for(String each : map.keySet()) {
			if(map.get(each).size() == number) {
				arrList.add(each);
			}
		}
		return arrList;
	}
	
	public void printFilesIn(String word) {
		for(int i = 0; i<map.get(word).size();i++) {
			System.out.println(map.get(word).get(i));
		}
	}
	
	public void test() {
		WordsInFiles test = new WordsInFiles();
		test.buildWordFileMap();
		int maxNum = test.maxNumber();
		System.out.println(maxNum);
//		System.out.println("test : " + test.wordsInNumFiles(maxNum));
		
		maxNum = 0;
		String maxKey = null;
		for(String key : map.keySet()) {
			if(map.get(key).size() >= maxNum) {
				maxNum = map.get(key).size();
				maxKey=key; 
			}
		}
		printFilesIn(maxKey);

	}
	public static void main(String[] args) {
		WordsInFiles test = new WordsInFiles();
		test.buildWordFileMap();
//		int maxNum = test.maxNumber();
//		System.out.println(maxNum);
//		System.out.println("test : " + test.wordsInNumFiles(maxNum));
		
		//quiz
		System.out.println("how many words are there in five files? : " + test.wordsInNumFiles(5).size());
		System.out.println("How many words are there that each appear in four of the five files? :"
				+ test.wordsInNumFiles(4).size());
		System.out.println("which file does the word “sad” NOT appear? : "
				+ test.map.get("sad"));
		System.out.println(" which files does the word “red” appear? "
				+ "(Select all that are correct.) : "
				+ test.map.get("red"));

	}

}
