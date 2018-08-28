package Week2_StringsSecondAssignments;

public class Part2 {

	public int howMany(String stringa, String stringb) {
		
		int startIndex = 0;
		int count =0;
//		System.out.println(stringa.length());
//		return stringb.indexOf(stringa,startIndex);
		while(true) {
			int currIndex = stringb.indexOf(stringa,startIndex);
			if(currIndex != -1) {
				startIndex =stringb.indexOf(stringa,startIndex)+stringa.length();
				count++;
			}
			else
				break;
		}
		return count;
	}
	
	public void testHowMany() {
		System.out.println(howMany("AA","ATAAAA"));
		System.out.println();
		System.out.println(howMany("GAA", "ATGAACGAATTGAATC"));
		System.out.println();
		System.out.println(howMany("A","AAAAAAAAAA"));
	}
	public static void main(String[] args) {
		Part2 test = new Part2();
		test.testHowMany();

	}

}
