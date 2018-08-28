package Week2_StringsSecondAssignments;

public class Part3 {
	
	public int findStopCodon(String dna, int startIndex, String stopCodon) {
		int currIndex = dna.indexOf(stopCodon,startIndex+3);

		while(currIndex!=-1) {
			if((currIndex - startIndex)%3==0) {
				return currIndex;
			}
			else {
				currIndex =dna.indexOf(stopCodon, currIndex+1); 
			}	
		}
		return dna.length();
	}

	public int findGene(String dna) {
		int count = 0;
		int currIndex = 0;
//		System.out.println();
		while(true) {
			int startIndex = dna.indexOf("ATG",currIndex);
//			System.out.println("startIndex : "+ startIndex);
			if(startIndex==-1) {
				return count;
			}
			int taaIndex = findStopCodon(dna,startIndex,"TAA");
			int tagIndex = findStopCodon(dna,startIndex,"TAG");
			int tgaIndex = findStopCodon(dna,startIndex,"TGA");
			
//			System.out.printf("TAA : %d, TAG : %d, TGA : %d", taaIndex,tagIndex,tgaIndex);
//			System.out.println();
			int endIndex = Math.min(taaIndex, Math.min(tagIndex, tgaIndex));
//			System.out.println(endIndex);
			if(endIndex!=dna.length()) {
				count ++;
				currIndex = endIndex+3;
			}
			else
				return count;
		}
	}
	
	
	public void testFindStopCodon() {
//		System.out.println("test1 (1): " + findGene("ATGTAA"));
//		System.out.println("test2 (2): " + findGene("ATGTAAAAAATGTGA"));
//		System.out.println("test3 (2) : " + findGene("ATGTAAGATGCCCTAGTA"));
		System.out.println("test4 (3) : " + findGene("ATGTAAGATGCCCTAGTATGATAAAAATGTAA"));
		System.out.println("test5 (2) : " + findGene("ATGTAATATGTATATGTGA"));
		System.out.println("test6 (3) : " + findGene("ATGTAAATTTTATGTGAATGTATTGA"));



	}
	
	public static void main(String[] args) {
		Part3 test = new Part3();
		test.testFindStopCodon();

	}
}
