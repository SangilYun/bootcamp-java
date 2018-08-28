package duke_arrays_week1;

import edu.duke.FileResource;

public class TestCaesarCipher {

	int findAlphabetIndex(char letter) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i<alphabet.length();i++) {
			if(alphabet.charAt(i) == letter) {
				return i;
			}
		}
		return -1;
	}
	
	int[] countLetters(String encrypted) {
		int[] counts = new int[26];
		for(int i = 0; i<encrypted.length(); i++) {
			char currChar = Character.toUpperCase(encrypted.charAt(i));
			int currCharIndex = findAlphabetIndex(currChar);
			if(currCharIndex != -1) {
				counts[currCharIndex] ++;
			}
		}
		return counts;
	}
	
	int maxIndex(int[] values) {
		int largestIndex = 0;
		for(int i=0; i<values.length;i++) {
			if(values[i] > values[largestIndex]) {
				largestIndex = i;
			}
		}
		return largestIndex;
	}
	
	void breakCaesarCipher(String input) {
		int maxDex = getKey(input);
		int dkey = maxDex-4;
		if(maxDex < 4) {
			dkey = 26- (4-maxDex);
		}
		CaesarCipherOOP test = new CaesarCipherOOP(dkey);
		String decrypted = test.decrypt(input);
		System.out.println(decrypted);
	}
	
	public String halfOfString(String message, int start) {
		String halfOfString = "";
		for(int i = start ; i<message.length(); i+=2) {
			halfOfString += message.charAt(i);
		}
		return halfOfString;
	}
	
	
	public int getKey(String s) {
		int[] counts = countLetters(s);
		int maxIndex = maxIndex(counts);
		return maxIndex;
	}
	
	
	void simpleTests() {
		FileResource fr = new FileResource();
		String file = fr.asString();
		CaesarCipherOOP test = new CaesarCipherOOP(18);
		String encrypted = test.encrypt(file);
		System.out.println(encrypted);
		System.out.println();
		System.out.println(test.decrypt(encrypted));
		
		TestCaesarCipher test1 = new TestCaesarCipher();
		test1.breakCaesarCipher("Dswj. Eq fwuwkksjawk sjw wetsjc'v. Xsjwowdd.\n" + 
				"Sfv, kaklwj, sk lzw oafvk yanw twfwxal");
	}
	
	public static void main(String[] args) {
		TestCaesarCipher test = new TestCaesarCipher();
//		int[] testArr =  test.countLetters("just a test file with a lot of eeeeeeeeeeeeeeeeeeeeeees");
//		System.out.println(Arrays.toString(testArr));
//		int testInt = test.maxIndex(testArr); 
//		System.out.println("maxIndex : " + testInt);
		test.simpleTests();
		
		
	}

}
