package Polymorphism.GreetingDemo;

import java.util.Scanner;

public class GreetingDemo {
	public static void main(String[] args) {
		String instruction = "What is your language?";
		Greeting greeting = null;
		Scanner sc = new Scanner(System.in);
		System.out.println(instruction);

		while (true) {
			String input = sc.next();
			if (input.equalsIgnoreCase("english")) {
				greeting = new GreetingEnglish();
				break;
			} else if (input.equalsIgnoreCase("french")) {
				greeting = new GreetingFrench();
			break;
			} else {
				System.out.println(instruction);
			}

		}
sc.close();
greeting.greet();
	}
}
