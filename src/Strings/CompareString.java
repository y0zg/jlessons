package Strings;


public class CompareString {
	public static void main(String[] args) {

		String s3="1000";
		int num2=Integer.parseInt(s3);
		System.out.println(s3);

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
