package sec02_exam_ParserExample;

public class HTMLParser implements Parseable{

	@Override
	public void parse(String filename) {
		//구문 분석작업을 수행하는 코드를 적는다.
		System.out.println(filename + "-HTML 구분 문석 완료!");	
	}

}
