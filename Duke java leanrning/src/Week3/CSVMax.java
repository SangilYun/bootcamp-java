package Week3;

import java.io.File;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import edu.duke.DirectoryResource;
import edu.duke.FileResource;

public class CSVMax {
	public CSVRecord hottestHourInFile(CSVParser parser) {
		//start with largestSoFar as nothing
		CSVRecord largestSoFar = null;
		//For each row(currentRow) in the CSV File
		for(CSVRecord currentRow : parser) {
			largestSoFar = getLargestOfTwo(currentRow, largestSoFar);
		}
		return largestSoFar;
	}

	public void testHottestInday() {
		FileResource fr = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/course material/hottestTemp/data/2014/weather-2014-01-03.csv");
		CSVRecord largest = hottestHourInFile(fr.getCSVParser());
		System.out.println("hottest temperature was "+largest.get("TemperatureF")
			+" at "+ largest.get("TimeEST"));
	}
	
	public CSVRecord hottestInManyDays() {
		CSVRecord largestSoFar = null;
		DirectoryResource dr = new DirectoryResource();
		//iterate over files
		for(File f : dr.selectedFiles()) {
			FileResource fr = new FileResource(f);
			CSVRecord currentRow = hottestHourInFile(fr.getCSVParser());
			largestSoFar = getLargestOfTwo(currentRow, largestSoFar);
		}
		//The largestSoFar is the answer
		return largestSoFar;
	} 
	
	public void testHottestInManyday() {
		CSVRecord largest = hottestInManyDays();
		System.out.println("hottest temperature was "+largest.get("TemperatureF")
			+" at "+ largest.get("DateUTC"));
	}
	
	public CSVRecord getLargestOfTwo(CSVRecord currentRow, CSVRecord largestSoFar) {
		if(largestSoFar == null) {
			largestSoFar = currentRow;
		}
		else {
			double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
			double largestTemp = Double.parseDouble(largestSoFar.get("TemperatureF"));
		//Check if currentRow's temperature > largestSoFar
			if(currentTemp > largestTemp) {
				//If so update largestSoFar to currentRow
				largestSoFar = currentRow;
			}
		}
		return largestSoFar;
	}
	
	public CSVRecord coldestHourInFile(CSVParser parser) {
		CSVRecord coldestSoFar=null;
		
		for(CSVRecord record : parser) {
			if (coldestSoFar == null) {
				coldestSoFar = record;
			}
			else{
				double currentTemp = Double.parseDouble(record.get("TemperatureF"));
				double coldestTemp = Double.parseDouble(coldestSoFar.get("TemperatureF"));
				if(currentTemp >0 && coldestTemp > currentTemp) {
					coldestSoFar = record;
				}
			}
		}
		return coldestSoFar;
	}
	
	public void testColdestDayInFile() {
		FileResource fr = new FileResource("/Users/yunsangil/Downloads/nc_weather/2014/weather-2014-05-01.csv");
		CSVRecord largest = coldestHourInFile(fr.getCSVParser());
		System.out.println("coldest temperature was "+largest.get("TemperatureF")
			+" at "+ largest.get("TimeEDT"));
	}
	
	public String fileWithColdestTemperature() {
		CSVRecord coldestSoFar = null;
		File filename = null;
		String lines = new String();
		DirectoryResource dr = new DirectoryResource();
		for(File f : dr.selectedFiles()) {
			FileResource fr = new FileResource(f);
			CSVRecord currentRow = coldestHourInFile(fr.getCSVParser());
			if(coldestSoFar == null) {
				coldestSoFar = currentRow;
				filename = f;
				lines = contents(lines,fr);
			}
			else {
				double coldestTemp = Double.parseDouble(coldestSoFar.get("TemperatureF"));
				double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
				
				if(coldestTemp > currentTemp) {
					coldestSoFar = currentRow;
					filename = f;
					lines = contents(lines,fr);	
				}
			}
		}

		return "Coldest day was in file "+filename.getName()+" \nColdest temperature on that day was : " + coldestSoFar.get("TemperatureF")
		+ "\nAll the temperatures on the coldest day were : \n" + lines;
	}
	
	public String contents(String lines, FileResource fr) {
		lines = new String();
		for(CSVRecord line : fr.getCSVParser()) {
			lines += line.get("DateUTC") + " ";
			lines += line.get("TemperatureF")+"\n";
		}
		return lines;
	}
	
	public void testFileWithColdestTemperature() {
		System.out.println(fileWithColdestTemperature());
	}
	
	public CSVRecord lowestHumidityInFile(CSVParser parser) {
		CSVRecord minHumidRow = null;
		for(CSVRecord record : parser) {
			CSVRecord currentRow = record;
			
			if(!currentRow.get("Humidity").equals("N/A")) {
				if(minHumidRow == null) {
					minHumidRow = currentRow;
				}
				else {
					
					Double currentHumid = Double.parseDouble(currentRow.get("Humidity"));
					Double prevHumid = Double.parseDouble(minHumidRow.get("Humidity"));
				
					if(currentHumid < prevHumid) {
						minHumidRow = currentRow;
					}
				}
			}
		}
		return minHumidRow;
	}
	
	public void testLowestHumidInFile() {
		FileResource fr = new FileResource();
		CSVParser parser = fr.getCSVParser();
		CSVRecord csv = lowestHumidityInFile(parser);
		
		System.out.println("Lowest Humidity was " + csv.get("Humidity")+" at "+ 
		csv.get("DateUTC"));
	}
	
	public CSVRecord lowestHumidityInManyFiles() {
		DirectoryResource dr = new DirectoryResource();
		CSVRecord minHumidRow = null;
		for(File f : dr.selectedFiles()) {
			FileResource fr = new FileResource(f);
			CSVRecord record = lowestHumidityInFile(fr.getCSVParser());
			CSVRecord currentRow = record;
			if(minHumidRow == null) {
				minHumidRow = currentRow;
			}
			else {
				double currentHumid = Double.parseDouble(currentRow.get("Humidity"));
				double prevHumid = Double.parseDouble(minHumidRow.get("Humidity"));
				if(currentHumid<prevHumid) {
					minHumidRow = currentRow;
				}
			}
		}
		return minHumidRow;
	}
	
	public void testLowestHumidityInManyFiles() {
		CSVRecord test = lowestHumidityInManyFiles();
		System.out.println("Lowest Humidity was " + test.get("Humidity")+" at "+ 
				test.get("DateUTC"));
	}
	
	public double averageTemperatureInFile(CSVParser parser) {
		double tempAverage = 0;
		int count = 0;
		for(CSVRecord record : parser) {
			String tempRow = record.get("TemperatureF");
			double temp = Double.parseDouble(tempRow);
			tempAverage += temp;
			count++;
		}
		return tempAverage/count;
	} 
	
	public void testAverageTemperatureInFile() {
		FileResource test = new FileResource();
		double avg = averageTemperatureInFile(test.getCSVParser());
		System.out.println("Average temperature in file is " + avg);
	} 
	
	public double averageTemperatureWithHighHumidityInFile(CSVParser parser, int value) {
		double avgtemp = 0;
		double count =0;
		for(CSVRecord record : parser) {
			double currentRowHumid = Double.parseDouble(record.get("Humidity"));
			if(currentRowHumid>=value) {
				avgtemp += Double.parseDouble(record.get("TemperatureF"));
				count++;
			}
		}
		if(avgtemp == 0)
			return 0;
		else
			return avgtemp/count;
	}
	
	public void testAverageTemperatureWithHighHumidityInFile() {
		FileResource test = new FileResource();
		double avg = averageTemperatureWithHighHumidityInFile(test.getCSVParser(), 80);
		if(avg ==0) {
			System.out.println("No temperatures with that humidity");
		}
		else {
			System.out.println("Average Temp when high Humidity is " + avg);
		}
	}
	
	public static void main(String[] args) {
		CSVMax test = new CSVMax();
//		test.testColdestDayInFile();
//		test.testHottestInday();
//		test.testHottestInManyday();
//		test.testFileWithColdestTemperature();
//		test.testLowestHumidInFile();
//		test.testLowestHumidityInManyFiles();
//		test.testAverageTemperatureInFile();
		test.testAverageTemperatureWithHighHumidityInFile();
	}
}
