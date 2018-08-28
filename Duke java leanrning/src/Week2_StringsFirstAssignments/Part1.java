package Week2_StringsFirstAssignments;

		/**
		 * Finds a protein within a strand of DNA represented as a string of c,g,t,a letters.
		 * A protein is a part of the DNA strand marked by start and stop codons (DNA triples)
		 * that is a multiple of 3 letters long.
		 *
		 * @author Duke Software Team 
		 */
	public class Part1 {
		
	public String findSimpleGene(String dna) {
		int startIndex = dna.indexOf("ATG");
		if(startIndex == -1)
			return "start -1 is found";
		int endIndex = dna.indexOf("TAA", startIndex);
		if(endIndex == -1)
			return "end -1 is found";
		if((endIndex - startIndex)%3 == 0) {
			return dna.substring(startIndex, endIndex+3);
		}
		return "%3 !=0";
	}
	public void testSimpleGene() {
		String dna1 = "ATGAAAAAATAA";
		String dna2 = "AAAAAATAA";
		String dna3 = "ATGDEFRRG";
		String dna4 = "SDFESFWER";
		String dna5 = "ATGAWEEFIJITAA";
		String test = "AAATGCCCTAACTAGATTAAGAAACC";
		
		System.out.println(dna1.indexOf("ATG"));
		System.out.println("test1 : valid = "+ findSimpleGene(dna1));
		System.out.println("test2 : no start codon = "+ findSimpleGene(dna2));
		System.out.println("test3 : no end codon = "+ findSimpleGene(dna3));
		System.out.println("test4 : no start/end = "+ findSimpleGene(dna4));
		System.out.println("test5 : not %3=0 = "+ findSimpleGene(dna5));
		System.out.println(findSimpleGene(test));

	}
	

	public static void main(String[] args) {
		Part1 test = new Part1();
		test.testSimpleGene();
	}
}
