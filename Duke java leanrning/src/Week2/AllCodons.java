package Week2;

public class AllCodons {

	public int findStopCodon(String dnaStr, int startIndex, String stopCodon) {

		int currIndex = dnaStr.indexOf(stopCodon,startIndex+3); 
		while(currIndex!=-1) {
			if((currIndex - startIndex)%3 ==0) {
				return currIndex;
			}
			else {
				currIndex = dnaStr.indexOf(stopCodon,currIndex+1);
			}
		}
		return dnaStr.length();
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
		int temp = Math.min(taaIndex, tagIndex);
		int minIndex = Math.min(temp, tgaIndex);
		//or Math.min(taaIndex,Math.min(tagIndex,tgaIndex))
		if (minIndex == dna.length()) {
			return "";
		}
		return dna.substring(startIndex,minIndex+3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
