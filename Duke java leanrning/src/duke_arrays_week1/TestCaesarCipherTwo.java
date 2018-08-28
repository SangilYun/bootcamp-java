package duke_arrays_week1;

public class TestCaesarCipherTwo {

	public String halfOfString(String message, int start) {
		String halfOfString = "";
		for(int i = start ; i<message.length(); i+=2) {
			halfOfString += message.charAt(i);
		}
		return halfOfString;
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
	
	int maxIndex(int[] values) {
		int largestIndex = 0;
		for(int i=0; i<values.length;i++) {
			if(values[i] > values[largestIndex]) {
				largestIndex = i;
			}
		}
		return largestIndex;
	}
	
	void simpleTest() {
//		FileResource fr = new FileResource();
//		String file = fr.asString();
		CaesarCipherTwo test = new CaesarCipherTwo(17,3);
		String encrypted = test.encrypt("it's just a test with a lot of eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees");
		System.out.println(encrypted);
		String decrypted = test.decrypt("zw'v mlvk r khjw zzwy r crk fi hvhvhvhvhvhvhvhvhvhvhvhvhvhvhvhvhj");
		System.out.println(decrypted);
	}
	
	public static void main(String[] args) {
		TestCaesarCipherTwo test = new TestCaesarCipherTwo();
		test.simpleTest();

	}

}
