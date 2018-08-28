package duke_arrays_week1;

public class CaesarCipherOOP {

	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String shiftedAlphabet;
	private int mainKey;
	
	CaesarCipherOOP(int key){
		this.mainKey = key;
		shiftedAlphabet =alphabet.substring(key) + alphabet.substring(0, key); 
	}
	
	String encrypt(String input) {
    	StringBuilder encrypted = new StringBuilder(input);
    	for(int i=0; i<encrypted.length();i++) {
	    	char currChar = encrypted.charAt(i);
	    	char tempChar = currChar;
	    	if(Character.isLowerCase(currChar))
	    		tempChar = Character.toUpperCase(currChar);
	    	int idx = alphabet.indexOf(tempChar);
	    	if(idx!=-1) {
	    		char newChar = shiftedAlphabet.charAt(idx);
	    		if(Character.isLowerCase(currChar))
	    			newChar = Character.toLowerCase(newChar);
	    		encrypted.setCharAt(i, newChar);
	    	}
    	}
    	return encrypted.toString();
	}
	
	String decrypt(String input) {
		CaesarCipherOOP cc = new CaesarCipherOOP(26 - mainKey);
		return cc.encrypt(input);
	}
	
	public static void main(String[] args) {
		CaesarCipherOOP test = new CaesarCipherOOP(2);
		System.out.println(test.encrypt("just a test file with a lot of eeeeeeeeeeeeeeeeeeeeeees"));
		System.out.println(test.decrypt("lwuv c vguv hkng ykvj c nqv qh gggggggggggggggggggggggu"));
	}
}
