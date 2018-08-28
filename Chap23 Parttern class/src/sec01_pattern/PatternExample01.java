package sec01_pattern;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample01 {

	public static void main(String[] args) {

		String[] data = {
							"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car",
							"combat", "count", "date", "disc"
		};
		Vector<String> vc = new Vector<String>(10);
		//pattern은 패턴을 정의하는데 사용(ex. c로 시작하는 소문자 영단어)
		Pattern p = Pattern.compile("c[a-z]*");
		System.out.println("c로 시작하는 소문자 영단어를 출력합니다.");
		
		for(int i=0; i<data.length; i++) {
			//Matcher는 Pattern(정규식)과 비교하는 역할
			Matcher m = p.matcher(data[i]);	
			
			//Pattern(정규식)과 일치하냐?
			if(m.matches()) {
				System.out.println(data[i] + ",");
				vc.add(data[i]);
			}
		}
		System.out.println();
		System.out.println(vc.toString());
	}

}
