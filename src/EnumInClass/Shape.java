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
				System.out.println("You selected dot, " + shape.shapeType);
				break;
			} else if (input.equalsIgnoreCase("2")) {
				shape.shapeType = ShapeType.LINE;
				System.out.println("You selected line, " + shape.shapeType);
				System.out.println(shape.shapeType.getClass().getName());
				break;
			} else {
				System.out.println("Type again");
				continue;
			}
		}

	}
}

