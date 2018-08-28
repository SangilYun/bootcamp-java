package sec01_verify;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
	    int input;
		int value;
		
	    System.out.println("input : ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		
		System.out.println("ouput : ");
		
		int[] arr = new int[input]; // create a new array
		for(int i=0; i<input; i++) { // iterate through
		value = (int)((Math.random()*10) + 1); // create a random number
		arr[i] = value; // assignment 
		System.out.println("arr["+i+"] = "+ arr[i]); //print out
		}
		
		scan.close();
	}

}
