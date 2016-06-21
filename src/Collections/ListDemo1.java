package Collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		String s1 = "Hello";
		String s2 = "World";
		list1.add(1);
		list1.add(s1);
		list1.add(200);
		list1.add(s2);
		list1.add(3, "NEW");
		list1.add(null);
		System.out.println("List1 size: " + list1.size()); //6
		for (Object obj1 : list1) {

			System.out.println("obj1 " + list1.indexOf(obj1) + ":" + obj1);
		}
// The java.util.Arrays class provides an asList method
// that lets you add an array or any number of elements to a List in one go.
// However, Arrays.asList returns a List with a fixed size, meaning you cannot add members to it.
		List list2 = Arrays.asList(1, "Value2", 3, "four");
		for (Object obj2 : list2) {

			System.out.println("obj2 " +
					list2.indexOf(obj2) +
					list2.lastIndexOf(obj2) +
					":" +
					obj2);
//List allows duplicate elements. By contrast, Set does not.
//	the java.util.Collections class is a helper or utility class
// that provides static methods for manipulating Lists and other Collections.
			List list3 = Arrays.asList(100, -5, 4, 1, 20);
			Collections.sort(list3);
			for (Object i : list3) {
				System.out.println("i = " + i);
			}

		}
	}
}
