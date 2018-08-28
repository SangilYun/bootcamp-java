package sec01_pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample02 {

	public static void main(String[] args) {
		//데이터 배열
		String[] data = {
				"bat", "baby", "bonus", "c", "cA", 
				"ca", "co", "c.", "c0", "c#", 
				"car", "combat", "count", "date", "disc"
		};
		
		//패턴 배열
		String[] pattern = {
				".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]",
				"c[a-zA-Z0-9]", "c.", "c.*", "c\\.",
				"c\\w", "c\\d", "c.*t", "[b|c].*",
				".*a.*", ".*a.+", "[b|c].{2}"
		};

		for(int x=0; x<pattern.length; x++) {
			Pattern p = Pattern.compile(pattern[x]); //Pattern 인스턴스를 얻음.
			System.out.print("pattern : " + pattern[x] + "결과 : ");
			
			for(int i=0; i<data.length; i++) {
				Matcher m = p.matcher(data[i]); //pattern과 일치하는지 검사
				if(m.matches())
					System.out.print(data[i] +",");
			}
			System.out.println();
		}
	}
}
