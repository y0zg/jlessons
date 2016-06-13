package Inheritance;



public class Sub extends Base {
	public Sub(String s) {
//super(); --  calls implicitly public Base()
		super(s); //public Base(String s)
		System.out.println(s);
	}

	public static void main(String[] args) {
		//first thing that the Sub class’s constructor does
		// is invoke the Base class’s no-arg constructor
		Sub s1 = new Sub("Start");
		Sub s2;

	}
}
class Base {
	public Base() {
		System.out.println("Base");
	}

	public Base(String s) {
		System.out.println("Base - " + s);
	}


}