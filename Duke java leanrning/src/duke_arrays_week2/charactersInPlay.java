package duke_arrays_week2;

import java.util.ArrayList;

import edu.duke.FileResource;

public class charactersInPlay {

	ArrayList<String> strArr = new ArrayList<String>();
	ArrayList<Integer> intArr = new ArrayList<Integer>();
	
	public void update(String person) {
		int index = strArr.indexOf(person);

		if(index == -1) {
			strArr.add(person);
			intArr.add(1);
		}
		else {
			intArr.set(index, intArr.get(index)+1);
		}
	}
	
	public void findAllCharacters() {
		strArr.clear();
		intArr.clear();
		FileResource fr = new FileResource("/Users/yunsangil/Desktop/likeit.txt");
		int maxIndex = 0;
		
		for(String line : fr.lines()) {
			for(int i =0; i<line.length();i++) {
				if(line.charAt(i) == '.') {
					update(line.substring(0,i));
				}
			}
		}	
		System.out.println(intArr +"\n" + strArr);
		for(int i=0;i<intArr.size();i++) {
			if(intArr.get(i) > maxIndex) {
				maxIndex = intArr.get(i);
			}
		}
		System.out.println("main character : " + strArr.get(intArr.indexOf(maxIndex)));
		System.out.println("how many times? : " + intArr.get(intArr.indexOf(maxIndex)));

	}
	
	public void charactersWithNumParts(int num1, int num2) {
		findAllCharacters();
	
		for(int i=0; i<intArr.size();i++) {
			if(intArr.get(i)>= num1 && intArr.get(i)<=num2 ) {
				System.out.println(strArr.get(i) + " " + intArr.get(i));
			}
		}
	}
	
	public void test() {
		
//		findAllCharacters();
		charactersWithNumParts(10,15);
		
//		findAllCharacters();
//		for(int i = 0 ; i<intArr.size(); i++){
//			System.out.println(strArr.get(i) + " " + intArr.get(i));
//		}
//		update("abcddeefff");
//		System.out.println(strArr);
//		System.out.println(intArr);
//		
//		update("abcddeefff");
//		System.out.println(strArr);
//		System.out.println(intArr);
//		
//		update("abceefff");
//		System.out.println(strArr);
//		System.out.println(intArr);
	}
	
	public static void main(String[] args) {
		charactersInPlay test = new charactersInPlay();
		test.test();

	}

}
