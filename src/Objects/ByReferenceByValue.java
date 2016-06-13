package Objects;

class Point {
	public int x;
	public int y;
}

public class ByReferenceByValue {
	public static void increment(int x) {
		++x;                  // prints 10

	}

	public static void reset(Point point) {
		point.x = 0;
		point.y = 0;
	}

	public static void main(String[] args) {
		int a = 9;
		increment(a);
		System.out.println(a); // prints 9
		a++;
		System.out.println(a); // prints 10
		Point p = new Point();
		p.x = 400;
		p.y = 600;
		System.out.println(p.x); // prints 400
		reset(p);
		System.out.println(p.x); // prints 0
	}
}

//	Now pay attention to the main method. We passed a (whose value is 9)
//	to the increment method. After the method invocation, we printed the value of a and you get 9,
//	which means that the value of a did not change.
//
//	Afterwards, you create a Point object and assign the reference to p.
//	You then initialize its fields and pass it to the reset method.
//	The changes in the reset method affects the Point object because objects are passed by reference.
//	As a result, when you print the value of p.x, you get 0.