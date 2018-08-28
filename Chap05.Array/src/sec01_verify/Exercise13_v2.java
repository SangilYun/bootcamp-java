//package sec01_verify;
//
//import java.util.ArrayList;
//
//public class Exercise13_v2 {
//
//	public static void main(String[] args) {
//		int max_count = 0;
//		int count = 0;
//		int max_num = 0;
//		ArrayList<Integer> arrL = new ArrayList<Integer>();
//		
//		System.out.println("실행결과");
//		
//		for(int i=0;i<100;i++) {
//			int ran_num = (int)(Math.random()*9);
//			System.out.print(ran_num + " ");
//			arrL.add(ran_num);
//		}System.out.println();
//		
//		for(int i=0; i<10;i++) {
//			count =0;
//			for(int each:arrL) {
//				if(i == each) {
//					count++;
//				}
//			}if(count>max_count) {
//				max_count=count;
//				max_num =i;
//			}
//		}
//		System.out.println("가장 많이 생성된 수는 : "+max_num+", "+max_count+"번");
//	}
//
//}
