package Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(100);
		sb.append("Matrix ");
		sb.append(2);
		System.out.println(sb); //Matrix 2
		sb.insert(0, 'B');
		System.out.println(sb); //BMatrix 2
	}
}
