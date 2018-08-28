package duke_arrays_week2;

import edu.duke.*;
import java.util.ArrayList;

public class WordFrequencies
{
    private ArrayList<String> myWords;
    private ArrayList<Integer> myFreqs;
    
    public WordFrequencies() {
        myWords = new ArrayList<String>();
        myFreqs = new ArrayList<Integer>();
    }
    
    public void findUnique(){
    	myWords.clear();
    	myFreqs.clear();
        FileResource resource = new FileResource("/Users/yunsangil/Desktop/likeit.txt");
        
        for(String s : resource.words()){
            s = s.toLowerCase();
            int index = myWords.indexOf(s);
            if (index == -1){
                myWords.add(s);
                myFreqs.add(1);
            }
            else {
                int freq = myFreqs.get(index);
                myFreqs.set(index,freq+1);
            }
        }
    }
    
    public void tester(){
        findUnique();
        System.out.println("length : " + myWords.size());
        System.out.println(myWords +"\n" +myFreqs);
        System.out.println(myWords.get(findMax()));
        System.out.println(myFreqs.get(findMax()));

////        System.out.println("# unique words: "+myWords.size());
//        int index = findMax();
////        System.out.println("max word/freq: "+myWords.get(index)+" "+myFreqs.get(index));
//        System.out.println("Number of unique words: " + myFreqs.size());
//        for(int i =0; i<myFreqs.size();i++) {
//        	System.out.println(myFreqs.get(i) + " " + myWords.get(i));
//        }
//        System.out.println("he word that occurs most often and its count are: "
//        		+myWords.get(index) + " " + myFreqs.get(index));
    }
    public int findMax(){
        int max = myFreqs.get(0);
        int maxIndex = 0;
        for(int k=0; k < myFreqs.size(); k++){
            if (myFreqs.get(k) > max){
                max = myFreqs.get(k);
                maxIndex = k;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
    	WordFrequencies test = new WordFrequencies();
    	test.tester();
    }
}