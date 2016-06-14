package Objects;

//You might want to ask this question, though. Why would you want to create an instance of a class
//using forName and newInstance, when using the new keyword is shorter and easier
//The answer is because there are circumstances whereby the name of the class is not known when you are writing the program.
public class ForName {
	public static void main(String[] args) {
		String country = "Fiji";
		Class myClass = country.getClass();
		System.out.println(myClass.getName()); //java.lang.String
		Class klass = null;
		try {
			klass = Class.forName("Objects.Simple"); //correct package and class name,
			// else doesn't create
		} catch (ClassNotFoundException e) {
		}

		if (klass != null) {
			try {
				Simple test = (Simple) klass.newInstance();
				test.print();
				System.out.println(test); //Objects.Simple@2401f4c3
			} catch (IllegalAccessException e) {
			} catch (InstantiationException e) {
			}
		}
	}
}
