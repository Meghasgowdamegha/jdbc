package day30_usingCallableStatement_3_Feb;

import java.sql.Connection;
import java.sql.SQLException;

public class Client {
	public static void main(String[] args) throws SQLException {

		Connection connection = DbUtil2.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection is taken..");
		
		}
}
