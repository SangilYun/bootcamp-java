package JunitPractice;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Test;

public class TestTest {

	JunitPrac test;
	int a;
	int b;
	@Before
	public void Setup() {
		a = 3;
		b = 4;
		test = new JunitPrac();
	}
	
	@Test
	public void addTest() {
		assertEquals(test.add(a, b), 7);
	}
}
