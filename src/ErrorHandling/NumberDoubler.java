package ErrorHandling;


import java.util.Scanner;

public class NumberDoubler {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		try{
		double d=Double.parseDouble(input);
		System.out.println(d);}
//		https://docs.oracle.com/javase/7/docs/api/java/lang/Double.html
//		public Double(String s)
//		throws NumberFormatException
		catch(NumberFormatException e){
			System.out.println("not valid number");
		}
	}
}
