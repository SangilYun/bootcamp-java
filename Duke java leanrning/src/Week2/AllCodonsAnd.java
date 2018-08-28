package Week2;

public class AllCodonsAnd {
	public int findStopCodon(String dnaStr, int startIndex, String stopCodon) {
		
		int currIndex = dnaStr.indexOf(stopCodon,startIndex+3);
		while(currIndex!=-1) {
			int diff = currIndex - startIndex;
			if(diff%3 ==0) {
				return currIndex;
			}
		else{
			currIndex = dnaStr.indexOf(stopCodon,currIndex+1);
		}	
	}
		return -1;
}
	public String findGene(String dna){
		//Find the first occurrence of ATG, the startCodon and store that in startIndex
		int startIndex = dna.indexOf("ATG");
		if(startIndex == -1) {
			return "";
		}
		int taaIndex = findStopCodon(dna,startIndex,"TAA");
		int tagIndex = findStopCodon(dna,startIndex,"TAG");
		int tgaIndex = findStopCodon(dna,startIndex,"TGA");
		
		//store in minIndex the smallest of these three variable
//		int temp = Math.min(taaIndex, tagIndex);
//		int minIndex = Math.min(temp, tgaIndex);
		//or Math.min(taaIndex,Math.min(tagIndex,tgaIndex))
		int minIndex = 0;
		if(taaIndex == -1 || (tgaIndex != -1 && tgaIndex < taaIndex)) {
			minIndex = tgaIndex;
		}
		else {
			minIndex = taaIndex;
		}
		//if taaIndex == -1 Or
		//if tgaIndex != -1 And tgaIndex < taaIndex
		//then set minIndex to tgaIndex
		//else set minIndex to taaIndex
		
		if(minIndex == -1 || (tagIndex != -1 && tagIndex <minIndex)) {
			minIndex = tagIndex;
		}
		if(minIndex ==-1) {
			return "";
		}
		return dna.substring(startIndex,minIndex+3);
		//if minIndex == -1 OR
		//if tagIndex != -1 and tagIndex <minIndex
		//then set minIndex to tagIndex
		//if minIndex ==-1, return ""
	}
	
	public void testFindGene() {
		String dna = "ATGCCCGGGAAATAACCC";
		String gene = findGene(dna);
		System.out.println(gene);
		if(!gene.equals("ATGCCCGGGAAATAA")) {
			System.out.println("error");
		}
		System.out.println("tests finished");
	}
	
	public static void main(String[] args) {
		AllCodonsAnd test = new AllCodonsAnd();
		test.testFindGene();

	}

}
