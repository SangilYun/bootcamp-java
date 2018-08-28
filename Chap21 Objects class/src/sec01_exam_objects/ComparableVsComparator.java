package sec01_exam_objects;

import java.util.Arrays;
import java.util.Comparator;

class Member implements Comparable<Member>{
	 int score;
	 String name;
	 
	 //생성자
	 public Member(int score, String name) {
		 this.score=score;
		 this.name=name;
	 }
	 public int getScore() {
		 return this.score;
	 }
	 @Override
	 public String toString() {
		 return this.score + ", " + this.name;
	 }
	 
	 //아래와 같이 객체의 정렬 기준을 제공해주면 Arrays.sort 메서드에서는
	 //그 정렬 기준을 받아와서 정렬을 한다. 그게 Comparable이든 Comparator이든..
	 
	 @Override
	 public int compareTo(Member o) {
//		 if(o.score< this.score) {
//			 return -1;
//		 }
//		 else if(o.score == this.score) {
//			 return 0;
//		 }
//		 else {
//			 return 1;
//		 }
//		 System.out.println(this);
		 System.out.println(this.score + " : " + o.score);
		 return (this.score)-(o.score); //올림차순
		 //return o.score - this.score; //내림차순
		 //return (this.score - o.score) * -1 //내림차순 
	 }
}	

class NameAscending implements Comparator<Member>{
	 @Override
	 public int compare(Member o1, Member o2) {
		 //return o1.name.compareTo(o2.name);//문자열을 사전순으로 오름차순 한다.
		 return o2.name.compareTo(o1.name); //문자열을 사전순으로 내림차순 한다.
		 //return 02.score - o1.score;
	 }
}	 

	 //결론은 Comparable은 기본 정렬기준을 구현하는데 사용을 한다.(CompareTo()메서드 재정의)
	 //하지만 Comparator는 기본 정렬기준 말고 다른 기준으로 정렬하고자 할 때 사용한다.
//	 (Compare()메서드 재정의)

public class ComparableVsComparator{
	

	public static void main(String[] args) {
	
		Member[] men ={
			new Member(100, "abc"), new Member(800, "aaa"),
			new Member(400, "ccc"), new Member(200, "bbb")
		};
		
		//정렬을 함.
		Member m1 = new Member(1,"신은혁");
		Member m2 = new Member(2,"김우진");
		Member[] mem1 = {m1, m2};
		
		//Arrays.sort()메서드는 매개값이 배열값이 기본형타입이면, 기본적으로 오름차순 정렬
		//매개값이 comparable<>인터페이스를 구현했다면 compareTo()의 리턴값으로 정렬을
		//선택한다.
		Arrays.sort(mem1);
		System.out.println(Arrays.toString(mem1));
		Arrays.sort(men);
		System.out.println(Arrays.toString(men));
	}
}

