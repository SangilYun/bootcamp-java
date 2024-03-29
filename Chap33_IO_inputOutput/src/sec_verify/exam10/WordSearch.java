package sec_verify.exam10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {

	public static void main(String[] args) throws Exception{
		 Vector<String> dict = new Vector<String>();
		 BufferedReader bf= new BufferedReader(new FileReader("/Users/yunsangil/Documents/computing/JAVA/Chap33 Input output stream/src/sec_verify/exam10/words.txt"));
		 Scanner scan = new Scanner(System.in);
		 String eachLine;
		 
		 while((eachLine = bf.readLine()) != null){
			 dict.add(eachLine);
		 }
		 
		 String input;
		 boolean flag = false;

		 while(true) {
			 System.out.println("찾는 단어 >>");
			 input = scan.nextLine();
			 if(input.equals("exit")) {
				 System.out.println("종료합니다");
				 break;
			 }
			 for(String each : dict) {
				 if(each.contains(input)) {
					 System.out.println(each);
					 if(!flag)
						 flag = true;
				 }
			 }
			 if(!flag)
				 System.out.println("없음");
			 flag = false;
		 }
		 scan.close();
		 bf.close();
	}
}
