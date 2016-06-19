package Enum1;

public class Customer {
	public CustomerType custType;
	public static void main(String[] args) {
		Customer cust=new Customer();
		cust.custType=CustomerType.INDIVIDUAL;

		System.out.println(cust);
		System.out.println(cust.custType);

		Customer cust2=new Customer();
		cust2.custType=CustomerType.ORGANIZATION;
		System.out.println(cust2);
		System.out.println(cust2.custType);
	}
}
//Static finals are not a perfect solution for something that should accept only predefined values.