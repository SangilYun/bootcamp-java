package sec_verify02;

import java.util.ArrayList;
import java.util.Scanner;

public class longStringSearch {

	private ArrayList<String> stringList;
	private Scanner scan;
	
	
	
	public longStringSearch(int i) {
		scan = new Scanner(System.in);
		stringList = new ArrayList<>(i);
		System.out.println(i+"만큼의 ArrayList가 생성되었습니다.");
		for(int k=0; k<i; k++) {
			System.out.println(k+1+"번째 이름을 입력하세요 >>");
			this.addString(scan.next());
		}	
		System.out.println("입력이 완료되었습니다.");
	}
	
	public void addString(String s) {
		this.stringList.add(s);
	}
	
	public void listPrint() {
		System.out.println("ArrayList에 들어 있는 모든 이름을 출력합니다.");
		for(int i=0; i<stringList.size(); i++) {
			System.out.println(i+1+"번째 ArrayList객체 값 : " + stringList.get(i));
		}
	}
	
	public void longestString() {
		String maxString ="";
		System.out.println("ArrayList에 들어 있는 모든 이름을 출력합니다.");
		for(int i=0; i<stringList.size(); i++) {
			if(maxString.length() < (stringList.get(i)).length()) {
				maxString = stringList.get(i);
			}
		}
		System.out.println("가장 긴 이름은 : " + maxString + "입니다.");
	}
}
