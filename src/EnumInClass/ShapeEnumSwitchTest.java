package EnumInClass;


public class ShapeEnumSwitchTest {

	public ShapeType shapeType;

	public static void main(String[] args) {

		ShapeEnumSwitchTest shape = new ShapeEnumSwitchTest();
		shape.shapeType = ShapeType.SQUARE;

		switch (shape.shapeType) {
			case DOT:
				System.out.println("This is dot"+shape.shapeType);
				break;
			case LINE:
				System.out.println("This is line");
				break;
			case TRIANGLE:
				System.out.println("This is tr");
				break;
			case SQUARE:
				System.out.println("This is sq"+shape.shapeType);
				break;
			default:
				System.out.println("Unknown value");
				break;
		}
	}
}
