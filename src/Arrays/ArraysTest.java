package Arrays;

//Class ArrayList -  resizeable
//Class Arrays - array  manipulations
//Array size is initialized at runtime

public class ArraysTest {
	public static void main(String[] args) {
		int arra[] = {11, 22, 33};
		int total = 0;
		for (int counter = 0; counter < arra.length; counter++) {
			System.out.println(counter + "-" + arra[counter]);
			total += arra[counter];
		}
		System.out.println(total);
	}
}
