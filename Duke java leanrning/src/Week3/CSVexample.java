package Week3;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import edu.duke.FileResource;

public class CSVexample {
	public void readFood() {
		FileResource fr = new FileResource("/Users/yunsangil/Desktop/computing/JAVA coursera/BlueJ/course material/FirstCSVExample/foods.csv");
		CSVParser parser = fr.getCSVParser();
		for(CSVRecord record : parser) {
			System.out.print(record.get("Name")+" ");
			System.out.println(record.get("Favorite Food"));
		}
	}
	void test() {
		readFood();
	}
	public static void main(String[] args) {
		CSVexample test = new CSVexample();
		test.test();


	}

}
