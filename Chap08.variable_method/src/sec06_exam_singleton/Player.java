package sec06_exam_singleton;

import java.util.Scanner;

public class Player {
	Scanner scan;
	private String name;
//	private String word;
	static String prevWord;
	
	Player(String name){
		scan = new Scanner(System.in);
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String sayWord() {
		System.out.println(this.name+">>");
		return scan.next();
	}
	
	public boolean succeed(String lastword) {
		char lastChar = lastword.charAt(0);
		char prevChar = prevWord.charAt(prevWord.length()-1);
		if(lastChar == prevChar) {
			prevWord = lastword;
			return true;
		}
		else {
			return false;
		}
	}
}
