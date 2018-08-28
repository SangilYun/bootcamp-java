package Week4;

import java.io.File;

import org.apache.commons.csv.CSVRecord;

import edu.duke.DirectoryResource;
import edu.duke.FileResource;

public class BabyBirths {
	
	public void printNames() {
		FileResource fr = new FileResource();
		for(CSVRecord rec : fr.getCSVParser(false)) { //false - no headrow
			int numBorn = Integer.parseInt(rec.get(2));
			if(numBorn <= 100) {
			System.out.println("Name "+rec.get(0) + 
					" Gender : " + rec.get(1) + 
					" Num Born " + rec.get(2));
			}
		}
	}
	
	public void totalBirths(FileResource fr) {

		int totalBirths = 0;
		int totalBoys = 0;
		int totalGirls = 0;
		for(CSVRecord rec : fr.getCSVParser(false)) { //false - no headrow
			int numBorn = Integer.parseInt(rec.get(2));
			totalBirths += numBorn;
			if(rec.get(1).equals("M")) {
				totalBoys += numBorn;
			}
			else {
				totalGirls += numBorn;
			}
		}
		System.out.println("total girls : "+totalGirls);
		System.out.println("total boys : "+totalBoys);
		System.out.println("total birth : "+totalBirths);
		

	}
	
	public void testTotalBirths() {
		FileResource fr = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/quiz material/example-small.csv");
		totalBirths(fr);
	}
	
	public long getRank(int year, String name, String gender) {
		long rank = 0;
		FileResource fr = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/quiz material/testing/yob2012short.csv");
		for(CSVRecord record : fr.getCSVParser(false)) {
			if(record.get(1).equals(gender)) {
				rank ++;
				if(record.get(0).equals(name)) {
					return rank;
				}
			}
		}
		return -1;
	}
	
	public String getName(int year, int rank, String gender) {
		int rankCount = 0;
		FileResource fr = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/quiz material/testing/yob" + year + "short.csv");
		for(CSVRecord record : fr.getCSVParser()) {
			if(record.get(1).equals(gender)) {
				rankCount ++;
				if(rankCount == rank) {
					return record.get(0);
				}
			}
		}
		return "NO NAME";
	}
	
	public void whatIsNameInYear(String name, int year, int newYear, String gender) {
		int rank = 0;
		FileResource fr = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/quiz material/testing/yob" + year + "short.csv");
		for(CSVRecord record : fr.getCSVParser()) {
			if(record.get(1).equals(gender)) {
				rank++;
				if(record.get(0).equals(name)) {
					int newRank =0;
					fr = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/quiz material/testing/yob" + newYear + "short.csv");
					for(CSVRecord newRecord : fr.getCSVParser()) {
						if(newRecord.get(1).equals(gender)) {
							newRank++;
						}
						if(rank == newRank) {
							System.out.println(newRecord.get(0));
						}
					}
				}
			}
		}
	}
	
	public int yearOfHighestRank(String name , String gender) {
		int year = -1;
		DirectoryResource dr = new DirectoryResource();
		File highestFile = null;
		int highestRank = Integer.MAX_VALUE;

		for(File f : dr.selectedFiles()) {
			FileResource fr = new FileResource(f);
			int rank =0;
			for(CSVRecord record : fr.getCSVParser()) {
				if(record.get(1).equals(gender)) {
					rank++;
					if(record.get(0).equals(name)) {
						if(highestRank > rank) {
							highestRank = rank;
							highestFile = f;
						}
					}
				}
			}
		}
		if(highestFile == null) {
			return -1;
		}
		else {
			year = Integer.parseInt(highestFile.getName().substring(3, 7));
			return year;	
		}
	}
	
	public double getAverageRank(String name, String gender) {

		double sumRank = 0;
		int fileCount = 0;
		DirectoryResource dr = new DirectoryResource();

		for(File f : dr.selectedFiles()) {
			FileResource fr = new FileResource(f);
			int rank =0;
			for(CSVRecord record : fr.getCSVParser()) {
				if(record.get(1).equals(gender)) {
					rank++;
					if(record.get(0).equals(name)) {
						sumRank += rank;
						fileCount ++ ;
					}
				}
			}
		}
		return sumRank/fileCount;
	}
	
	public int getTotalBirthsRankedHigher(String year, String name, String gender) {
		
		FileResource fr = new FileResource();
		int birthSum =0;
		for(CSVRecord record : fr.getCSVParser()) {
			if(record.get(1).equals(gender)) {
				if(!record.get(0).equals(name)) {
					birthSum += Integer.parseInt(record.get(2));
				}
				else {
					return birthSum;
				}
			}
		}
		return -1;
	}
	
	public void findName(String name, String gender) {
		FileResource fr = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/quiz material/us_babynames/us_babynames_by_year/yob1993.csv");
		System.out.println("testing...");
		for(CSVRecord record : fr.getCSVParser()) {
			
			if(record.get(1).equals(gender)) {

				if(record.get(0).equals(name)) {
					System.out.println("name matched...");

					System.out.println(name+"is " +Integer.parseInt(record.get(2)));
				}
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		BabyBirths test = new BabyBirths();
//		test.printNames();
//		test.testTotalBirths();
//		System.out.println("rank : " + test.getRank(2012, "Mason", "M"));
//		System.out.println("name : " + test.getName(2012, 3, "M"));
//		test.whatIsNameInYear("Isabella", 2012, 2014, "F");
//		System.out.println(test.yearOfHighestRank("Mason","M"));
//		System.out.println(test.getAverageRank("Mason","M"));
		System.out.println(test.getTotalBirthsRankedHigher("2012", "Ethan", "M"));
//		test.findName("Yelda","F");
	}

}
