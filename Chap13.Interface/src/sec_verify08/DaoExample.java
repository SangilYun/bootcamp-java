package sec_verify08;

public class DaoExample {

	public static void dbWork(DataAccessObject da) {
		da.select();
		da.insert();
		da.update();
		da.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}
