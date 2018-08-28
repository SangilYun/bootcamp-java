package Junit_exam01_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Junit_exam01.Data;
import Junit_exam01.DataDao;

public class DataDaoTest {

	private DataDao dataDao;
	
	@Before
	public void setUp() throws Exception {
		dataDao = new DataDao();
	}

	@Test
	public void test() {
		//addData호출 후, db.size가 3이 되는지 테스트를 한다
		dataDao.addData(new Data(0,0));
		assertEquals(3, dataDao.getDataAll().size());
	}

}
