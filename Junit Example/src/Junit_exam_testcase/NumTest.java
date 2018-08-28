package Junit_exam_testcase;

import static org.junit.Assert.*;
import Junit_exam.Num;
import org.junit.Before;
import org.junit.Test;

//NumTest 클래스는 Num클래스에 있는 생성자, 메서드 등을 
//일반 콘솔이 아니라 JUNI을 이용해서 테스트를 하는 클래스이다. 
public class NumTest {

	Num n;
	
	@Before
	public void setUp() throws Exception {
		n = new Num(10);
	}

	@Test
	public void test() {
		assertEquals(10, n.getValue());	//getValue test
		assertEquals(20, n.addValue(10));	//addValue test
		n.setValue(20);
		assertEquals(20, n.getValue());
	}

}
