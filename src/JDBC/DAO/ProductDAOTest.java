package JDBC.DAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class ProductDAOTest {
	private static final String CREATE_TABLE_SQL =
			"CREATE TABLE products ("
					+ "id INTEGER,"
					+ "name VARCHAR(255),"
					+ "description VARCHAR(1000),"
					+ "price DECIMAL(10,2),"
					+ "PRIMARY KEY  (id))";
	private static void createDatabase() {

		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		try (Connection connection =
					 DriverManager.getConnection(dbUrl, "user1",
							 "qweqwe");
			 Statement statement =
					 connection.createStatement()) {
			statement.execute(CREATE_TABLE_SQL);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		try {
			Class.forName ("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		createDatabase();
		Product product = new Product();
		product.setName("Kiano tablet keyboard");
		product.setDescription("Low cost tablet keyboard, "
				+ "compatible will all Android devices");
		product.setPrice(new BigDecimal(24.95));

		ProductDAO productDAO = new ProductDAOImpl();
		try {
			productDAO.insert(product);
		} catch (DAOException e) {
			e.printStackTrace();
		}

		List<Product> products = null;
		try {
			products = productDAO.getProducts();
		} catch (DAOException e) {
			e.printStackTrace();
		}

		products.stream().forEach(System.out::println);
	}
}