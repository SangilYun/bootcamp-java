package sec_verify13;

import java.util.Collections;
import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		int totalStu=0;
		int sum=0;
		HashMap<String,Integer> map = new HashMap<>();
		map.put("신은혁", 96);
		map.put("김주성", 86);
		map.put("김연안", 92);
		map.put("김기리", 88);
		map.put("안홍범", 90);
		map.put("박주영", 44);
		map.put("안정환", 55);
		map.put("박성식", 2);
		map.put("윤두호", 9);
		map.put("엄기홍", 12);
		
		totalStu=map.size(); //총 학생 수 
		//합계 점수
		for(Integer i : map.values()) {
			sum+= i;
		}
		
		System.out.println("종합 학생 수 :" + totalStu);
		System.out.println("평균 점수 : " + sum/totalStu);
	
		for(String name : map.keySet()) {
			if(map.get(name) == Collections.max(map.values())){
				System.out.println("최고 점수 : " + map.get(name));
				System.out.println("최고 점수를 받은 아이디 : " + name);
			}
			else if (map.get(name) == Collections.min(map.values())) {
				System.out.println("최저 점수 : " + map.get(name));
				System.out.println("최저 점수를 받은 아이디 : " + name);
			}
		}
	}
}
