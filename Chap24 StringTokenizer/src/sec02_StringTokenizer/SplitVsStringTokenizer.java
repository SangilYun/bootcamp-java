package sec02_StringTokenizer;

import java.util.StringTokenizer;

public class SplitVsStringTokenizer {

	public static void main(String[] args) {
		 
		String data = "100    200 300";
		//둘다 구분자를 공백으로 했음에도 불구하고 결과는 다르다.
		//그 이유는, split()은 공백도 하나의 토큰으로 인정하지만, 
		//StringTokenizer는 그렇지 않다.
		//빅데이터에서는 이런 성능의 차이는 큰 결과를 초래한다.
		//따라서 StringTokenizer를 사용하는 것이 바람직하다.
		String[] result = data.split(" ");
		StringTokenizer st = new StringTokenizer(data, " ");
		
		for(int i=0; i< result.length; i++) {
			System.out.print(result[i] + "|");
		}
		System.out.println("개수 : " + result.length);

		int i=0;
		//StringTokenizer 클래스의 hasMoreTokens()메서드와 nextTokens()메서드는 
		//String에서 토큰을 가져와서 출력하고 삭제를 한다.
		//따라서 아래 while문에서는 출력결과가 나오지 않는다.
		System.out.println("개수 : " + st.countTokens());
		for(;st.hasMoreTokens();i++)
			System.out.print(st.nextToken() + "|");
		
		System.out.println("개수 : " + i);
		System.out.println("개수 : " + st.countTokens());
		
		StringTokenizer st1 = new StringTokenizer(data, " ");
		while(st1.hasMoreTokens()) {
			System.out.println("남은 토큰수 : " + st1.countTokens());
			String str = st1.nextToken();
			System.out.println(str);
		}
	}
}
