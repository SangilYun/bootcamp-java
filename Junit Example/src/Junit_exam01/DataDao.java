package Junit_exam01;

import java.util.ArrayList;

public class DataDao {

	private ArrayList<Data> db;
	
	public DataDao() {
		db = new ArrayList<Data>();
		db.add(new Data(1,2));
		db.add(new Data(10,20));
	}
	
	public void addData(Data data) {
		db.add(new Data(100,200));
	}
	
	public ArrayList<Data> getDataAll(){
		return this.db;
	}
	
}
