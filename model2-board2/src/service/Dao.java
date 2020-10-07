package service;

public class Dao {
	public boolean login(String id, String pw) {
		String dbid = "admin";
		String dbpw = "1234";
		if(id.contentEquals(dbid)&&pw.equals(dbpw)) {
			return true;
		}
		return false;
	}
}
