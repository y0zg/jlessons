package EnumSwitch;

public class CustomerTest {
	public CustomerType custType;
	public static void main(String[] args) {
		CustomerTest cust=new CustomerTest();
		cust.custType=CustomerType.INDIVIDUAL;

		System.out.println(cust);
		System.out.println(cust.custType);

		CustomerTest cust2=new CustomerTest();
		cust2.custType=CustomerType.ORGANIZATION;
		System.out.println(cust2);
		System.out.println(cust2.custType);
	}
}
//Static finals are not a perfect solution for something that should accept only predefined values.