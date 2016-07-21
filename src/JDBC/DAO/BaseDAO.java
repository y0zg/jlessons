package JDBC.DAO;


import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO implements DAO {
	public static final String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";

	public Connection getConnection() throws DAOException {
		try {
			return DriverManager.getConnection(dbUrl,"user1",
					"qweqwe");
		} catch (Exception e) {
			throw new DAOException();
		}
	}
}
