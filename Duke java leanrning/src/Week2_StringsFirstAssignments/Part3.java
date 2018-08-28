package Week2_StringsFirstAssignments;

public class Part3 {
	public boolean twoOccurences(String stringa, String stringb) {
		int first = stringb.indexOf(stringa);
		if(first!=-1) {
			int second = stringb.indexOf(stringa,first+stringa.length());
				if(second==-1)
					return false;
		}else {
			return false;	
		}
		return true;
	}
	
	public String lastPart(String stringa , String stringb) {
		int strIndex = stringb.indexOf(stringa);
		if(strIndex!=-1) {
			return stringb.substring(strIndex+stringa.length());
		}
		else
			return stringb;
			
	}
	
	public void test() {
		System.out.println(twoOccurences("abc", "aaabbbbabcbabcbbb"));
		System.out.println(twoOccurences("a", "aaabbbbabcbabcbbb"));
		System.out.println(twoOccurences("a", "absggergerge"));
		System.out.println(lastPart("an", "banana"));
		System.out.println(lastPart("zoo", "forest"));
	}
	
	public static void main(String[] args) {
		Part3 test = new Part3();
		test.test();


	}

}
