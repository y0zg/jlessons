package Interfaces;

//Create an interface named Calculator in com.example with three methods, add, subtract and multiply.
//All methods take two int arguments and return a long.
public class CalculatorTest implements Calculator {
	@Override
	public long add(int a, int b) {
		return a+b;
	}

	@Override
	public long subtract(int a, int b) {
		return a-b;
	}

	@Override
	public long multuiply(int a, int b) {
		return a*b;
	}

	public static void main(String[] args) {
		CalculatorTest ct=new CalculatorTest();
		long resultAdd=ct.add(1,5);
		System.out.println(resultAdd);
	}
}
