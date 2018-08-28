package sec01_firstArray;

import java.util.Arrays;

public class Array_Example03 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100,95,80,70,60}; // 선언과 동시에 초기
		int[] iArr4 = new int[] {100,95,80,70,60}; // 방의 숫자를 초기화 하진 않았지만 주어진 데이터 수
												   // 에 맞춰서 방을 생성한다.
		char[] chArr = new char[] {'a','b','c','d'};
		
		System.out.println("배열 iArr1의 초기화 값 : ");
		
		for(int i= 0; i<iArr1.length; i++) {
			System.out.println(iArr1[i]);
		}
		System.out.println();
		
		for(int i=0;i<iArr1.length;i++) {
			iArr1[i]=i+1; //1~10의 숫자를 순서대로 넣는다.
		}
		for(int i=0;i<iArr1.length;i++) {
			iArr2[i]=(int)(Math.random()*10)+1; //1~10의 숫자를 순서대로 넣는다.
		}
		for(int i=0; i<iArr1.length;i++) {
			if(i==9)
				System.out.println(iArr1[i]);
			else
				System.out.println(iArr1[i]+",");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(iArr2)); //[__,__,__...]형태로 출
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(iArr4));
		//print() method 안에 참조형 변수가 오면 기본적으로 객체이름 @16진수가 나온다.
		//그리고 참조형변수(레퍼런스변수)뒤에는 .toString()이 생략되어있다.
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3.toString()); //배열 내부주소 출
		System.out.println(iArr3);
		System.out.println(chArr.toString());
		//char타입만 toString()을 호출해야 주소가 나오고
		//toString()을 호출하지 아니하면 그냥 값들이 출력 
		System.out.println(chArr.toString());
		System.out.println(chArr);




	}

}
