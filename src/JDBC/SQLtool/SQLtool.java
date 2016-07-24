package JDBC.SQLtool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SQLTool {
	private String dbUrl;
	private String dbUserName;
	private String dbPassword;
	private static final int COLUMN_WIDTH = 25;

	public SQLTool(String dbUrl,
				   String dbUserName, String dbPassword) {
		this.dbUrl = dbUrl;
		this.dbUserName = dbUserName;
		this.dbPassword = dbPassword;
	}

	public void executeSQL(String sql) {
		sql = sql.trim();
		try (Connection connection =
					 DriverManager.getConnection(dbUrl,
							 dbUserName, dbPassword);
			 Statement statement = connection.createStatement()) {
			if (sql.toUpperCase().startsWith("SELECT")) {
				try (ResultSet resultSet =
							 statement.executeQuery(sql)) {
					ResultSetMetaData metaData =
							resultSet.getMetaData();
					int columnCount = metaData.getColumnCount();
					for (int i = 0; i < columnCount; i++) {
						System.out.print(pad(
								metaData.getColumnName(i + 1)));
					}
					// draw line
					int length = columnCount * COLUMN_WIDTH;
					StringBuilder sb = new StringBuilder(length);
					for (int i = 0; i < length; i++) {
						sb.append('=');
					}
					System.out.println();
					System.out.println(sb.toString());

					while (resultSet.next()) {
						String[] row = new String[columnCount];
						for (int i = 0; i < columnCount; i++) {
							row[i] = resultSet.getString(i + 1);
							System.out.print(pad(row[i]));
						}
						System.out.println();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				int recordsUpdated = statement.executeUpdate(sql);
				System.out.println(recordsUpdated
						+ " record(s) affected");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		System.out.println();
	}

	// appends s with spaces so that the length is 25
	private String pad(String s) {
		int padCount = COLUMN_WIDTH - s.length();
		StringBuilder sb = new StringBuilder(25);
		sb.append(s);
		for (int i = 0; i < padCount; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String dbUrl =  "jdbc:oracle:thin:@localhost:1521:xe";
		String dbUserName = null;
		String dbPassword = null;

		SQLTool sqlTool = new SQLTool(dbUrl,
				"user1", "qweqwe");
		try {
			Class.forName ("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = null;
		do {
			sql = JOptionPane
					.showInputDialog("Enter an SQL Statement");
			if (sql != null && !sql.trim().isEmpty()) {
				sqlTool.executeSQL(sql);
			}
		} while (sql != null);
	}
}