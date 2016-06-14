package Strings;


public class CompareString {
	public static void main(String[] args) {



		String s1 = "Java";
		String s2 = new String("Java");
		if (s1.equals(s2)) {
			System.out.println("\ts1=s2 ");
		} else {
			System.out.println("s1<>s2");
		}

		if(s1==s2){
			System.out.println("s1=s2");
		} else {
			System.out.println("s1<>s2");
		}

		String s3="1000";
		int num2=Integer.parseInt(s3);
		System.out.println(num2);

		//Every time the JVM creates an object,
		// it also creates a java.lang.Class object that describes the type of the object.

		Class myClass=s3.getClass();
		System.out.println(myClass); //class java.lang.String

		//valueOf

		double d = 102939939.939;
		boolean b = true;
		long l = 1232874;
		char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };

		System.out.println("Return Value : " + String.valueOf(d) );
		System.out.println("Return Value : " + String.valueOf(b) );
		System.out.println("Return Value : " + String.valueOf(l) );
		System.out.println("Return Value : " + String.valueOf(arr) );
	}
}
