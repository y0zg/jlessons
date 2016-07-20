package JDBC;
import java.sql.*;

public class OracleJDBC {

	public static void main(String[] argv) throws SQLException {

		System.out.println("-------- Oracle JDBC Connection Testing ------");

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;

		}

		System.out.println("Oracle JDBC Driver Registered!");

		Connection con = null;

		try {

			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "user1",
					"qweqwe");

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

		if (con != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		//step3 create the statement object

			Statement stmt = con.createStatement();

//step4 execute query
			ResultSet rs1 = stmt.executeQuery("select * from dept");


			while (rs1.next())
				System.out.println(rs1.getInt(1) + "  " + rs1.getString(2) + "  " + rs1.getString(3));

//step5 close the connection object
		con.close();
	}

}

//	The executeUpdate method executes an SQL INSERT, UPDATE, or DELETE statement as well as
// data definition language (DDL) statements to create, drop, and alter tables.
// This method returns the row count for INSERT, UPDATE, or DELETE statements or
// returns 0 for SQL statements that return nothing.