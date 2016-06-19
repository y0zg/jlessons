package Enum1;

public class Customer {
	public CustomerType custType;
	public static void main(String[] args) {
		Customer cust=new Customer();
		cust.custType=CustomerType.INDIVIDUAL;

		System.out.println(cust.custType);
	}
}
