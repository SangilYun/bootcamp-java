package duke_arrays_week1;

import java.util.Arrays;

import edu.duke.FileResource;

public class WordLengths {

	void countWordLengths(FileResource resource, int[] counts) {
		for(String word : resource.words()) {
			if(!Character.isLetter(word.charAt(word.length()-1))) {
				word = word.substring(0, word.length()-1);
			}
			
			if(!Character.isLetter(word.charAt(0))) {
				word = word.substring(1);
			}
			
			int length = word.length();
			System.out.println("lengh : " + length);
			System.out.println("word : " + word);
			if(length > counts.length) {
				counts[counts.length-1]++;
			}
			
			else {
			counts[length]++;
			}
			
		}
	}
	
	void testCountWordLengths() {
		FileResource fr = new FileResource();
		int[] arr = new int[31];
		countWordLengths(fr,arr);
		System.out.println("result : " + Arrays.toString(arr));
		System.out.println("indexOfMax : " + indexOfMax(arr));
	}
	
	int indexOfMax(int[] values) {
		int largestIndex = 0;
		for(int i=0; i<values.length;i++) {
			if(values[i] > largestIndex) {
				largestIndex = values[i];
			}
		}
		return largestIndex;
	}
	public static void main(String[] args) {
		WordLengths test = new WordLengths();
		test.testCountWordLengths();
	}

}
