package Week2;

public class FindGeneWhile {
	
	public String findGene(String dna) {
		//Find first occurrence of "ATG" call its index "startIndex"
		int startIndex = dna.indexOf("ATG");
		//Find the "TAA" starting from(starIndex+3), call this result currIndex
		int currIndex = dna.indexOf("TAA",startIndex+3);
		//As long as currIndex is not equal to -1
		while(currIndex!=-1) {
			//Check if (currIndex - startIndex) is a multiple of 3
			if((currIndex-startIndex)%3==0)
				//If so, the text between startIndex and currIndex +3 is your answer
				return dna.substring(startIndex, currIndex+3);
				//if not, update currIndex to the index of the next TAA, starting from(currIndex+1)
			else
				currIndex = dna.indexOf("TAA",currIndex+1);
		//Your answer is the empty string
		}
		return"";
	}

	public void testFindGeneSimple() {
		String dna = "AATGTAAA";
		System.out.println("DNA strand is " +dna);
		String gene = findGene(dna);
		System.out.println("Gene is " +gene);
	}
	public static void main(String[] args) {
		FindGeneWhile test = new FindGeneWhile();
		test.testFindGeneSimple();
	}
	
}

