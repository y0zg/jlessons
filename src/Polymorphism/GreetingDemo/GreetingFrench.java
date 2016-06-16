package Polymorphism.GreetingDemo;

/**
 * Created by webstddesign on 6/16/2016.
 */
public class GreetingFrench implements Greeting {
	@Override
	public void greet() {
		System.out.println("Bonjour!");
	}
}
