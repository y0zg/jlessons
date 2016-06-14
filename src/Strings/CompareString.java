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
	}
}
//	Here are some escape sequences:
//
//		\u          /* a Unicode character
//       \b          /* \u0008: backspace BS */
//		\t          /* \u0009: horizontal tab HT */
//		\n          /* \u000a: linefeed LF */
//		\f          /* \u000c: form feed FF */
//		\r          /* \u000d: carriage return CR */
//		\"          /* \u0022: double quote " */
//		\'          /* \u0027: single quote ' */
//		\\          /* \u005c: backslash \ */