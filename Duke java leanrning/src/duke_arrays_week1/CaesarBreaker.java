package duke_arrays_week1;

public class CaesarBreaker {

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
	
	public String decrypt(String encrypted) {
		CaesarChipher_v2 cc = new CaesarChipher_v2();
		int[] freqs = countLetters(encrypted);
		int maxDex = maxIndex(freqs);
		int dkey = maxDex - 4;
		System.out.println("dkey : " + dkey);
		if(maxDex < 4) {
			dkey = 26- (4-maxDex);
		}

		return cc.encrypt(encrypted, 26 - dkey);
	}
	
	void testDecrypt() {
		String decrypted = decrypt("Nywx e xiwx wxvmrk amxl psxw sj iiiiiiiiiiiiiiiiiw");
		System.out.println("decrypted : " + decrypted);
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
	
	String decryptTwoKeys(String encrypted) {
		String firstHalf = halfOfString(encrypted, 0);
		String secondHalf = halfOfString(encrypted, 1);
		int firstKey = getKey(firstHalf);
		int secondKey = getKey(secondHalf);
		
		
		int fDkey = firstKey-4;
		int sDkey = secondKey -4;
		
		
		if(firstKey < 4) {
			fDkey = 26- (4-firstKey);
		}
		
		if(secondKey < 4) {
			sDkey = 26- (4-secondKey);
		}

		System.out.println("first key : " + fDkey);
		System.out.println("second Key : " + sDkey);
		
		CaesarChipher_v2 cc = new CaesarChipher_v2();
	
		return cc.encryptTwoKeys(encrypted, 26 - fDkey, 26-sDkey);
	}
	
	public static void main(String[] args) {
		CaesarBreaker test = new CaesarBreaker();
//		System.out.println(test.findAlphabetIndex('e'));
//		test.testDecrypt();
//		System.out.println(test.halfOfString("Qbkm Zgise", 1));
//		System.out.println(test.decryptTwoKeys("Nywx e xiwx wxvmrk amxl psxw sj iiiiiiiiiiiiiiiiiw"));
//		System.out.println(test.decryptTwoKeys("Akag tjw Xibhr awoa aoee xakex znxag xwko\n"));
//		FileResource fr = new FileResource();
//		String testFile = fr.asString();
//		System.out.println(test.decryptTwoKeys(testFile));
		String dc = test.decryptTwoKeys("ix'w nuwt a tisx aixh a lst oj ieieieieieieieieieieieieieieieieis");
		System.out.println(dc);
	}

}
