package duke_arrays_week1;

public class CaesarChipher_v2 {
    public String encrypt(String input, int key) {
        //Make a StringBuilder with message (encrypted)
    	StringBuilder encrypted = new StringBuilder(input);
        //Write down the alphabet
    	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //Compute the shifted alphabet
    	String shifted = alphabet.substring(key) + alphabet.substring(0, key);
        //Count from 0 to < length of encrypted, (call it i)
    	for(int i=0; i<encrypted.length();i++) {
	        //Look at the ith character of encrypted (call it currChar)
	    	char currChar = encrypted.charAt(i);
	    	char tempChar = currChar;
	        //Find the index of currChar in the alphabet (call it idx)
	    	if(Character.isLowerCase(currChar))
	    		tempChar = Character.toUpperCase(currChar);
	    	int idx = alphabet.indexOf(tempChar);
	        //If currChar is in the alphabet
	    	if(idx!=-1) {
	    		char newChar = shifted.charAt(idx);
	    		if(Character.isLowerCase(currChar))
	    			newChar = Character.toLowerCase(newChar);
	    		encrypted.setCharAt(i, newChar);
	    	}
    		//Otherwise: do nothing
    	}
        //Your answer is the String inside of encrypted
    	return encrypted.toString();
    }
    
    public void testCaesar() {
//        int key = 17;
//        FileResource fr = new FileResource();
//        String message = fr.asString();
//        String encrypted = encrypt(message, key);
//        System.out.println(encrypted);
//        String decrypted = encrypt(encrypted, 26-key);
//        System.out.println(decrypted);
//        String test = encrypt("First Legion", 17);
//        System.out.println(test);
       String test = encrypt("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!",15);
       System.out.println(test);
    }
    
    public String encryptTwoKeys(String input, int key1, int key2) {
    	StringBuilder encrypted = new StringBuilder(input);
    	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	
    	String shiftedKey1 = alphabet.substring(key1) + alphabet.substring(0, key1);
    	String shiftedKey2 = alphabet.substring(key2) + alphabet.substring(0, key2);

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
					newChar = shiftedKey1.charAt(idx); 
				}
				else {
					newChar = shiftedKey2.charAt(idx);
				}
				if(Character.isLowerCase(currChar)) {
					newChar = Character.toLowerCase(newChar);
				}
				encrypted.setCharAt(i, newChar);
			}
    	}
    	return encrypted.toString();
    }
   
    public void testEncryptTwoKeys() {
//    	String test = encryptTwoKeys("First Legion", 23, 17);
//    	System.out.println(test);
//    	String test = encryptTwoKeys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 8, 21);
//    	System.out.println(test);
//    	String test = encrypt("Just a test string with lots of eeeeeeeeeeeeeeeees", 4);
//    	System.out.println(test);
//    	String decrypted = encrypt("Nywx e xiwx wxvmrk amxl psxw sj iiiiiiiiiiiiiiiiiw", 26-4);
//    	System.out.println(decrypted);
    	String test = encryptTwoKeys("it's just a test with a lot of eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeees", 17, 3);
    	System.out.println(test);
    

    }
 	
    public static void main(String[] args) {
 		CaesarChipher_v2 test = new CaesarChipher_v2();
// 		test.testCaesar();
 		test.testEncryptTwoKeys();
 	}
}