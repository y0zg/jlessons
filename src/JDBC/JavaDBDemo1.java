package JDBC;

import java.sql.*;

public class JavaDBDemo1 {
	private static String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";

	private static final String CREATE_TABLE_SQL =
			"CREATE TABLE person1 "
					+ "(person_id INT, name VARCHAR(100))";

	public void createTable() {
		try (Connection connection =
					 DriverManager.getConnection(dbUrl,"user1",
							 "qweqwe");
			 Statement statement =
					 connection.createStatement()) {
			statement.execute(CREATE_TABLE_SQL);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	private static final String INSERT_DATA_SQL =
			"INSERT INTO person1 (person_id, name) "
					+ "VALUES (?, ?)";

	public void insertData(int id, String name) {
		try (Connection connection =
					 DriverManager.getConnection(dbUrl,"user1",
							 "qweqwe");
			 PreparedStatement pStatement =
					 connection.prepareStatement(
							 INSERT_DATA_SQL);) {
			pStatement.setInt(1, id);
			pStatement.setString(2, name);
			pStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static final String READ_DATA_SQL =
			"SELECT person_id, name FROM person1";

	public void readData() {
		try (Connection connection =
					 DriverManager.getConnection(dbUrl,"user1",
							 "qweqwe");
			 PreparedStatement pStatement =
					 connection.prepareStatement(READ_DATA_SQL);
			 ResultSet resultSet = pStatement.executeQuery()) {
			while (resultSet.next()) {
				System.out.println(resultSet.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// must add derby.jar to classpath
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;

		}

		System.out.println("Oracle JDBC Driver Registered!");
		JavaDBDemo1 demo = new JavaDBDemo1();
		demo.createTable();
		demo.insertData(1, "Alvin Average");
		demo.readData();
	}

}
