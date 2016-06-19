package EnumInClass;

import java.util.Scanner;

public class Shape {

	public ShapeType shapeType;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Available enums:");
		for (ShapeType enums : ShapeType.values()) {

			System.out.println(enums);
		}

		Shape shape = new Shape();

		String st = "Enter Shape corners";
		while (true) {
			String input = sc.next();
			if (input.equalsIgnoreCase("1")) {
				shape.shapeType = ShapeType.DOT;
				System.out.println("You selected dot, value is: " + shape.shapeType);
				break;
			} else if (input.equalsIgnoreCase("2")) {
				shape.shapeType = ShapeType.LINE;
				System.out.println("You selected line, value is: " + shape.shapeType);
				break;
			} else {
				System.out.println("Type again");
				continue;
			}
		}

	}
}

