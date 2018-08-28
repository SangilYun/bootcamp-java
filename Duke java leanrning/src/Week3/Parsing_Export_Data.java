package Week3;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import edu.duke.FileResource;

public class Parsing_Export_Data {
	void tester() {
//		FileResource fr = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/course material/exports/exports_small.csv");
//		CSVParser parser = fr.getCSVParser();
//		System.out.println(countryInfo(parser, "Germany"));
//		
//		parser = fr.getCSVParser();
//		System.out.println();
//		listExportersTwoProducts(parser, "gold", "diamonds");
//		
//		parser = fr.getCSVParser();
//		System.out.println();
//		System.out.println(numberOfExporters(parser,"gold"));
//		
//		parser = fr.getCSVParser();
//		System.out.println();
//		bigExplorers(parser,"$999,999,999");
	
		FileResource fr = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/course material/exports/exportdata.csv");
		CSVParser parser = fr.getCSVParser();
		listExportersTwoProducts(parser,"fish","nuts");
		
		parser = fr.getCSVParser();
		System.out.println(numberOfExporters(parser,"sugar"));
		
		parser = fr.getCSVParser();
		System.out.println(countryInfo(parser, "Nauru"));
		
		parser = fr.getCSVParser();
		System.out.println();
		bigExplorers(parser,"$999,999,999,999");
	}
	
	String countryInfo(CSVParser parser, String country) {
		for(CSVRecord record : parser) {
			String names = record.get("Country");
			if(names.contains(country)) {
				String exports = record.get("Exports");
				String values = record.get("Value (dollars)");
				return names+": "+exports+": "+values;
			}
		}
		return "NOT FOUND";
	}
	
	void listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2) {
	
		for(CSVRecord record : parser) {
			String countryNames = record.get("Exports");
			if(countryNames.contains(exportItem1) && countryNames.contains(exportItem2)) {
				System.out.println(record.get("Country"));
			}
		}
	}
	
	int numberOfExporters(CSVParser parser, String exportItem) {
		int sum = 0;
		for(CSVRecord record : parser) {
			String items = record.get("Exports");
			if(items.contains(exportItem)) {
				sum++;
			}
		}
		return sum;
	}
	
	void bigExplorers(CSVParser parser, String amount) {
		for(CSVRecord record : parser) {
			String value = record.get("Value (dollars)");
			if(value.length()>amount.length()) {
				String country = record.get("Country");
				System.out.printf("%s %s \n",country, value);
			}
		}
	}
	public static void main(String[] args) {
		Parsing_Export_Data test = new Parsing_Export_Data();
		test.tester();
	}
}
