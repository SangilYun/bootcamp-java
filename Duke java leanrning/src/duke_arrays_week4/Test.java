package duke_arrays_week4;

import java.util.Arrays;
import java.util.HashSet;

import edu.duke.FileResource;

public class Test {

	public void testVigenereBreaker() {
		VigenereBreaker vb = new VigenereBreaker();
//		FileResource fr = new FileResource("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week4/VigenereProgram/VigenereTestData/athens_keyflute.txt");
		//quiz
		FileResource fr = new FileResource("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week4/VigenereProgram/messages/secretmessage1.txt");
//		System.out.println(vb.sliceString("abcdefghijklm",0, 3));	//sliceString test
		String encrypted = fr.asString();
		System.out.println(Arrays.toString(vb.tryKeyLength(encrypted, 4, 'e')));
	}
	
	public void testbreakVigenere() {
		VigenereBreaker vb = new VigenereBreaker();
		vb.breakVigenere();
	}
	
	public void testreadDictionary() {
		VigenereBreaker vb = new VigenereBreaker();
		FileResource fr = new FileResource("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week4/VigenereProgram/dictionaries/English");
		System.out.println(vb.readDictionary(fr));
	}
	
	public void NewtestVigenereBreaker() {
		@SuppressWarnings("unused")
		VigenereBreaker test = new VigenereBreaker();
	}
	
	//for quiz
	public void quiz4() {
		VigenereBreaker test = new VigenereBreaker();
		FileResource fr = new FileResource("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week4/VigenereProgram/messages/secretmessage2.txt");
		String encrypted = fr.asString();
		FileResource dic = new FileResource("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week4/VigenereProgram/dictionaries/English");
		HashSet<String> dicSet = test.readDictionary(dic);
		int[] key = test.tryKeyLength(encrypted, 38, 'e');
		VigenereCipher vc =  new VigenereCipher(key);
		String decrypted = vc.decrypt(encrypted);
		System.out.println("valid words : "+test.countWords(decrypted, dicSet));
		
	}
	
	public void finaltestVigenereBreaker() {
		VigenereBreaker test = new VigenereBreaker();
		test.breakVigenere();
	}
	public static void main(String[] args) {
		Test test = new Test();
//		test.testVigenereBreaker();
//		test.testbreakVigenere();
//		test.testreadDictionary();
//		test.NewtestVigenereBreaker();
//		test.quiz4();
		test.finaltestVigenereBreaker();

	}

}
