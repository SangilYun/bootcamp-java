package duke_arrays_week4;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;

import edu.duke.DirectoryResource;
import edu.duke.FileResource;

public class VigenereBreaker {
	
	public VigenereBreaker() {
//		FileResource fr = new FileResource("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week4/VigenereProgram/VigenereTestData/athens_keyflute.txt");
		//quiz
//		FileResource fr = new FileResource("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week4/VigenereProgram/messages/secretmessage2.txt");
//		String file = fr.asString();
//		FileResource dic = new FileResource("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week4/VigenereProgram/dictionaries/English");
//		HashSet<String> dicSet = readDictionary(dic);
//		String decrypted = breakForLanguage(file, dicSet);
//		System.out.println(decrypted);
//		System.out.println("Valid words : " + countWords(decrypted, dicSet));
		
	}
    public String sliceString(String message, int whichSlice, int totalSlices) {
        //REPLACE WITH YOUR CODE
    	StringBuilder sb = new StringBuilder();
    	for(int i = whichSlice; i<message.length(); i+=totalSlices) {
    		sb.append(message.charAt(i));
    	}
    	
        return sb.toString();
    }

    public int[] tryKeyLength(String encrypted, int klength, char mostCommon) {
        int[] key = new int[klength];
        //WRITE YOUR CODE HERE
        CaesarCracker cc = new CaesarCracker();
        for(int i=0; i<klength; i++) {
        	String sliced = sliceString(encrypted, i, klength);
        	int eachKey = cc.getKey(sliced);
        	key[i] = eachKey;
        	}

        return key;
    }

    public void breakVigenere () {
        //WRITE YOUR CODE HERE
//    	FileResource fr = new FileResource("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week4/VigenereProgram/VigenereTestData/athens_keyflute.txt");
    	//quiz
//    	FileResource fr = new FileResource("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week4/VigenereProgram/messages/secretmessage1.txt");
    	DirectoryResource dr = new DirectoryResource();
    	HashMap<String, HashSet<String>> langDict = new HashMap<String, HashSet<String>>();
    	for(File f : dr.selectedFiles()) {
    		FileResource dictFile = new FileResource(f);
    		HashSet<String> words = readDictionary(dictFile);
    		langDict.put(f.getName(), words);
    	}
//    	FileResource fr = new FileResource("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week4/VigenereProgram/VigenereTestData/athens_keyflute.txt");
    	//quiz
    	FileResource fr = new FileResource("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week4/VigenereProgram/messages/secretmessage3.txt");
//    	FileResource fr = new FileResource("/Users/yunsangil/Documents/computing/JAVA coursera/BlueJ/quiz material/Arrays_week4/VigenereProgram/messages/secretmessage4.txt");

    	String input = fr.asString();
    	breakForAllLangs(input, langDict);
    	System.out.println("IT WORKS");
    	
    }
    
    public HashSet<String> readDictionary(FileResource fr) {
    	HashSet<String> set = new HashSet<String>();
    	for(String line : fr.lines()) {
    		String eachLine = line.toLowerCase();
    		set.add(eachLine);
    	}
    	
    	return set;
    }
    
    public int countWords(String message, HashSet<String> dictionary) {
    	String[] splited = message.split("\\W+");
    	int count = 0;
    	for(int i=0; i<splited.length;i++) {
    		if(dictionary.contains(splited[i].toLowerCase())) {
    			count ++;
    		}
    	}

    	return count;
    }
    
    public String breakForLanguage(String encrypted, HashSet<String> dictionary) {
    	int count = 0;
    	String potential = "";
    	@SuppressWarnings("unused")
		int[] key = null;
    	for(int i=1; i<=100; i++) {
    		char commonKey = mostCommonCharIn(dictionary);
    		int[] keyset = tryKeyLength(encrypted, i, commonKey);
			VigenereCipher vc = new VigenereCipher(keyset);
			String decrypted = vc.decrypt(encrypted);
			if(countWords(decrypted, dictionary) > count) {
				count = countWords(decrypted, dictionary);
				potential = decrypted;
				key = keyset;
			}
    	}
//    	System.out.println("keyset : " + Arrays.toString(key));
//    	System.out.println("keysetlength : " + key.length);

    	return potential;
    }
    
    public char mostCommonCharIn(HashSet<String> dictionary) {
    	
    	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    	for(String each : dictionary) {
    		for(int j=0; j<each.length();j++) {
    			if(!map.containsKey(each.charAt(j))){
    				map.put(each.charAt(j), 1);
    			}
    			else {
    				map.put(each.charAt(j), map.get(each.charAt(j))+1);
    			}
    		}
    	}
    	int count = 0;
    	char most = 0;
    	for(char c : map.keySet()) {
    		if(map.get(c) > count) {
    			count = map.get(c);
    			most = c;
    		}
    	}
    	return most;
    }
    
    public void breakForAllLangs(String encrypted, HashMap<String, HashSet<String>> languages) {
    	int maxCount =0;
    	String potentialDec= "";
    	String language = "";
    	for(String each : languages.keySet()) {
    		System.out.println("language : " + each);
    		HashSet<String> dictionary = languages.get(each);
			String decrypted = breakForLanguage(encrypted, dictionary);
			int count = countWords(decrypted, dictionary);
			if(count > maxCount) {
				maxCount = count;
				potentialDec = decrypted; 
				language = each;
			}
    	}
    	System.out.println("language : " + language);
    	System.out.println("decrypted : \n" + potentialDec);
    }
}
