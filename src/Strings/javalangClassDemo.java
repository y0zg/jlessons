package Strings;


public class javalangClassDemo {
	public static void main(String[] args) {

		String s3="1000";
		int num2=Integer.parseInt(s3);
		System.out.println(num2);
		//Every time the JVM creates an object,
		// it also creates a java.lang.Class object that describes the type of the object.

		Class myClass=s3.getClass();
		System.out.println(myClass); //class java.lang.String

		/*The Class class also brings the possibility of creating an object without using the new keyword.
				You achieve this by using the two methods of the Class class, forName and newInstance.*/

	}
}
