package Week3;

import edu.duke.*;
import org.apache.commons.csv.*;

public class WhichCountriesExport {
		public void listExporters(CSVParser parser, String exportOfInterest) {
			for(CSVRecord record : parser) {					//for each row in the CSV File
				String export = record.get("Exports");			//Look at the "Exports" column
				if(export.contains(exportOfInterest)) {			//Check if it contains exportOfInterest
					String country = record.get("Country");		//if so, write down the "Country" from that row
					System.out.println(country);
				}		
			}
		}
		public void whoExportsCoffee() {
//			FileResource fr = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/course material/exports/exportdata.csv");
			FileResource fr = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/course material/exports/exports_small_Ms.csv");
			CSVParser parser = fr.getCSVParser();
			listExporters(parser, "coffee");
		}
	public static void main(String[] args) {
		WhichCountriesExport test = new WhichCountriesExport();
		test.whoExportsCoffee();

	}
}
