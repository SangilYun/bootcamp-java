package sec_verify05;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		 String str = "아이디,이름,패스워드";
		 String[] strArr = str.split(",");
		 StringTokenizer st = new StringTokenizer(str,",");
		 
		 
		 System.out.println("split");
		 for(String each : strArr) {
			 System.out.println(each);
		 }
		 System.out.println("");
		 System.out.println("StringTokenizer");
		 while(st.hasMoreTokens()) {
			 System.out.println(st.nextToken());
		 }
	}

}
