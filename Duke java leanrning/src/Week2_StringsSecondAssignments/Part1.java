package Week2_StringsSecondAssignments;

public class Part1 {
	
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

	public String findGene(String dna) {
		int startIndex = dna.indexOf("ATG");
		if(startIndex==-1) {
			return "";
		}
		int taaIndex = findStopCodon(dna,startIndex,"TAA");
		int tagIndex = findStopCodon(dna,startIndex,"TAG");
		int tgaIndex = findStopCodon(dna,startIndex,"TGA");
		
		
		int endIndex = Math.min(taaIndex, Math.min(tagIndex, tgaIndex));
		if(endIndex!=dna.length())
			return dna.substring(startIndex, endIndex+3);
		else
			return "";
	}
	
	public void testFindStopCodon() {
		System.out.println("test1 : " + findStopCodon("ATGTTAAAATGATAA",0,"TAA"));
		System.out.println("test2(invalid) : " + findStopCodon("ATGTTAAAATGTAA",0,"TAA"));
		System.out.println("test3 : " + findGene("ATGTTAAAATGATAA"));
		System.out.println("test4(invalid, no ATG) : " + findGene("TTAAAATATA"));
		System.out.println("test5(invalid) : " + findGene("TAATGAATTATTATGTAAAAAAAAAAA"));
		System.out.println("test6 : " + findGene("ATGAAATTATAATAGTGA"));
		System.out.println("test7 : " + findGene("ATGTAA"));
		System.out.println("test8 : " + findStopCodon("ATGTAA",0,"TAA"));
		System.out.println("test9(=test8) : " + "ATGTAA".indexOf("TAA",3));
		System.out.println("test10 : " + findStopCodon("ATGTAA",0,"TGA"));
		System.out.println("test11 : " + findGene("ATGATGTAATGATAG"));
	}
	
	
	public static void main(String[] args) {
		Part1 test = new Part1();
		test.testFindStopCodon();
	}
}
