package ErrorHandling;

public class Capitalize {

	public String capitalize(String s) throws NullPointerException, AlreadyCapitalizedException {
		if (s == null) {
			throw new NullPointerException(
					"@@@You passed a null argument@@@");
		}
		Character firstChar = s.charAt(0);
		if (Character.isUpperCase(firstChar)) {
			throw new AlreadyCapitalizedException();
		}
		String theRest = s.substring(1);
		return firstChar.toString().toUpperCase() + theRest;

	}

	public static void main(String[] args) throws AlreadyCapitalizedException {
		String word = "Test";
		String result;
		Capitalize cap = new Capitalize();
		result = cap.capitalize(word);
		System.out.println(result);
	}
}
