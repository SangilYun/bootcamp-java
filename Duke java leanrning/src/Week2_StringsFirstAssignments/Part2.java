package Week2_StringsFirstAssignments;

public class Part2 {
	
	public String findSimpleGene(String dna, String startCodon, String endCodon) {
		if (Character.isLowerCase(dna.charAt(0))){
			startCodon = startCodon.toLowerCase();
			endCodon = endCodon.toLowerCase();
		}else {
			startCodon = startCodon.toUpperCase();
			endCodon = endCodon.toLowerCase();
		}
		int startIndex = dna.indexOf(startCodon);

		if(startIndex == -1)
			return "start -1 is found";
		int endIndex = dna.indexOf(endCodon, startIndex);
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
		String dna6 = "aefdddatgsssdddtaa";
		
		System.out.println(dna1.indexOf("ATG"));
		System.out.println("test1 : valid = "+ findSimpleGene(dna1,"ATG","TAA"));
		System.out.println("test2 : no start codon = "+ findSimpleGene(dna2,"ATG","TAA"));
		System.out.println("test3 : no end codon = "+ findSimpleGene(dna3,"ATG","TAA"));
		System.out.println("test4 : no start/end = "+ findSimpleGene(dna4,"ATG","TAA"));
		System.out.println("test5 : not %3=0 = "+ findSimpleGene(dna5,"ATG","TAA"));
		System.out.println("test6 : lowercase = "+ findSimpleGene(dna6,"ATG","TAA"));

		
	}
	
	public static void main(String[] args) {
		Part2 test = new Part2();
		test.testSimpleGene();
	}

}
