package JDBC.DAO;

import java.math.BigDecimal;

public class Product {
	private String name;
	private String description;
	private BigDecimal price;
private Integer id;

	public Integer getId() {		return id;	}
	public void setId(Integer id) {		this.id = id;	}

	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return name + ", $" + price + ", " + description;
	}
}