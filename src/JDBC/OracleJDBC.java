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
		Statement stmt=con.createStatement();

//step4 execute query
		ResultSet rs=stmt.executeQuery("select * from dept");
		while(rs.next())
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

//step5 close the connection object
		con.close();
	}

}