package Week2_StringsThirdAssignments;

import edu.duke.FileResource;
import edu.duke.StorageResource;

	public class Part1 {
	
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
		//Set startIndex to 0
		StorageResource store = new StorageResource();
		int startIndex = 0;
		//Repeat the following steps
			while(true) {
			//Find the next gene after startIndex
			String currentGene = findGene(dna, startIndex);
			System.out.println(currentGene);

			//If no gene was found, leave this loop
			if(currentGene.isEmpty()) {
				break;
			}
			//Print that gene out
			store.add(currentGene);			
			//Set startIndex to just past the end of the gene
			startIndex=dna.indexOf(currentGene, startIndex)
					+currentGene.length(); // quite tricky part
			}
		return store;
	}
	
	public void testOn(String dna) {
		System.out.println("Testing printAllGenes on "+dna);
		for(String s : getAllGenes(dna).data()) {
			System.out.println(s);
		}
	}
	
	public double cgRatio(String dna) {
		int count=0;
		for(int i=0; i<dna.length();i++) {
			if(dna.charAt(i)=='C' || dna.charAt(i)=='G') {
				count++;
			}
		}
		return (float)count/dna.length();
	}
	
	public int countCTG(String dna) {
		int startIndex = 0;
		int count = 0;
		while(true) {
			int currIndex = dna.indexOf("CTG",startIndex);
			if(currIndex == -1) {
				break;
			}
			count++;
			startIndex = currIndex+3;
		}
		return count;
	}
	
	void processGenes(StorageResource sr) {
		int longCount=0;
		int ratioCount=0;
		int longest=0;
		for(String each : sr.data()) {
			if(each.length()>60) {
				longCount ++;
				System.out.println("Str>9 : "+each); //print all the Strings in sr that are longer than 9 characters
				System.out.println("numStr>9 : "+longCount);//print the number of Strings in sr that are longer than 9 characters
			}
			if(cgRatio(each)>0.35) {
				ratioCount++;
				System.out.println("ratio : " +each);
				System.out.println("numRat : " +ratioCount);
			}
			if(each.length()>=longest)
				longest = each.length();
		}
		System.out.println("longest : "+longest);	
	}
	
	void testProcessGenes() {
//		processGenes(getAllGenes("ATGAAAAAATTTAAATAA"));
//		processGenes(getAllGenes("ATGTAA"));
//		processGenes(getAllGenes("ATGCGCGCGCGCGCGCGCGCGCGCGCGCGCTAG"));
//		processGenes(getAllGenes("ATGGCTTTTTTTTTTTTTTATTGTTAG"));
//		
		FileResource fr = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/quiz material/dna/brca1line.fa");
		String dna = fr.asString();
		processGenes(getAllGenes(dna.toUpperCase()));
	}
	
	public void test() {
		testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
		System.out.println();
		testOn("ATGTAAGATGCCCTAGTATGATAAATGTAA");
		System.out.println();
		testOn("AATGCTAACTAGCTGACTAAT");
		System.out.println(cgRatio("ATGCCATAG"));
		System.out.println(countCTG("CGT")); //0
		System.out.println(countCTG("CTG")); //1
		System.out.println(countCTG("CTGCTG")); //2
		System.out.println(countCTG("CTGACTCTGG")); //2
		
	}
	
	public static void main(String[] args) {
		Part1 test = new Part1();
		test.testProcessGenes();
	
	}

}
