package Week2_StringsFirstAssignments;
import edu.duke.*;

public class Part4 {

	public static void main(String[] args) {
		 URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
		 for (String s : ur.words()) {
			 if(s.toLowerCase().contains("youtube.com")) {
			     int startIndex = s.indexOf("\"");
			     int endIndex = s.indexOf("\"",startIndex+1);
			     System.out.println(s.substring(startIndex+1, endIndex));
			 }
		 }
	 }
	
}
