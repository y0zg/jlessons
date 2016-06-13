package Objects;

public class StaticInitializationTest {
	public static int a = 5;
	public static int b = a * 2;
	static {
		System.out.println("static");
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println("main method");
	}
}

//		Initialization occurs just before the main method is executed.
//		However, before the specified class can be initialized, its parent class will have to be initialized.
//		If the parent class has not been loaded and linked, the JVM will first load and link the parent class.
//		Again, when the parent class is about to be initialized, the parent’s parent will be treated the same.
//		This process occurs recursively until the initialized class is the topmost class in the hierarchy.