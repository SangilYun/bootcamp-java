package duke_arrays_week1;

public class WordPlay {

	public boolean isVowel(char ch) {
		if("AEIOUaeiou".indexOf(ch)!= -1) {
			return true;
		}
		return false;
	}
	
	public String replaceVowels(String phrase, char ch) {
		StringBuilder input = new StringBuilder(phrase);
		for(int i=0; i<phrase.length();i++) {
			if(isVowel(phrase.charAt(i))== true){
				input.setCharAt(i, ch);
			}
		}
		return input.toString();
	}
	
	public String emphasize(String phrase, char ch) {
		StringBuilder input = new StringBuilder(phrase);
		for(int i=0; i<phrase.length();i++) {
			if(Character.toUpperCase(phrase.charAt(i)) == Character.toUpperCase(ch)) {
				if(i%2 == 0) {
					input.setCharAt(i, '*');
				}
				else {
					input.setCharAt(i, '+');
				}
			}
		}
		return input.toString();
	}
	public static void main(String[] args) {
		WordPlay test = new WordPlay();
//		System.out.println(test.isVowel('A'));
//		System.out.println(test.replaceVowels("Hello World",'*'));
//		System.out.println(test.emphasize("dna ctgaaactga", 'a'));
		System.out.println(test.emphasize("Mary Bella Abracadabra", 'a')); 
	}

}
