package Collections;


import java.util.ArrayList;
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
		System.out.println("List1 size: "+list1.size()); //6
		for (Object obj1:list1){

			System.out.println("obj1 " + list1.indexOf(obj1)+":"+obj1);

		}
	}
}
