package duke_arrays_week1;

public class CaesarCipherTwo {

	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String shiftedAlphabet1;
	private String shiftedAlphabet2;
	private int mainKey1;
	private int mainKey2;


	CaesarCipherTwo(int key1, int key2){
		this.shiftedAlphabet1 = alphabet.substring(key1) + alphabet.substring(0, key1);
		this.shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0, key2);
		this.mainKey1 = key1;
		this.mainKey2 = key2;
	}
	
	String encrypt(String input) {
    	StringBuilder encrypted = new StringBuilder(input);

    	for(int i=0; i<encrypted.length();i++) {

    		char currChar = encrypted.charAt(i);
    		char tempChar = currChar;
			if(Character.isLowerCase(currChar)) {
				tempChar = Character.toUpperCase(tempChar);
			}
			int idx = alphabet.indexOf(tempChar);
			if(idx!=-1) {
				char newChar;
				if(i%2 == 0) {
					newChar = shiftedAlphabet1.charAt(idx); 
				}
				else {
					newChar = shiftedAlphabet2.charAt(idx);
				}
				if(Character.isLowerCase(currChar)) {
					newChar = Character.toLowerCase(newChar);
				}
				encrypted.setCharAt(i, newChar);
			}
    	}
    	return encrypted.toString();
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
	
	String decrypt(String input) {
				
		CaesarChipher_v2 cc = new CaesarChipher_v2();
	
		return cc.encryptTwoKeys(input, 26-mainKey1, 26-mainKey2);
	}
}
