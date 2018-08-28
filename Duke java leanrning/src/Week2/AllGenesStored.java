package Week2;

import edu.duke.StorageResource;

public class AllGenesStored {
	
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
	
	public String findGene(String dna, int where){
		//Find the first occurrence of ATG, the startCodon and store that in startIndex
		int startIndex = dna.indexOf("ATG", where);
		if(startIndex == -1) {
			return "";
		}
		int taaIndex = findStopCodon(dna,startIndex,"TAA");
		int tagIndex = findStopCodon(dna,startIndex,"TAG");
		int tgaIndex = findStopCodon(dna,startIndex,"TGA");
		
		//store in minIndex the smallest of these three variable
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
	}
	
	public StorageResource getAllGenes(String dna) {
		//create an empty StorageResource, call it geneList
		StorageResource geneList = new StorageResource();
		//Set startIndex to 0
		int startIndex = 0;
		//Repeat the following steps
			while(true) {
			//Find the next gene after startIndex
			String currentGene = findGene(dna, startIndex);
			//If no gene was found, leave this loop
			if(currentGene.isEmpty()) {
				break;
			}
			//Add that gene to geneList
			geneList.add(currentGene);
			//Set startIndex to just past the end of the gene
			startIndex=dna.indexOf(currentGene, startIndex)
					+currentGene.length(); // quite tricky part
			}
			return geneList;
	}
	
	public void testOn(String dna) {
		StorageResource genes = getAllGenes(dna);
		for(String g : genes.data()) {
			System.out.println(g);
		}
	}
	public void test() {
		testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
		System.out.println();
		testOn("ATGTAAGATGCCCTAGTATGATAAATGTAA");
		System.out.println();
		testOn("AATGCTAACTAGCTGACTAAT");
	
	//	testOn("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllGenesStored test = new AllGenesStored();
		test.test();
		
	}

}
