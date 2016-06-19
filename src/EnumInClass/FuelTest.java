package EnumInClass;


	abstract class Car {

		protected String name;
		protected FuelType fuelEfficiency;

		public double calculateMinGasUsage(int miles) {
			int mpg = fuelEfficiency.getMax();
			return (double) miles / mpg;
		}

		public double calculateMaxGasUsage(int miles) {
			int mpg = fuelEfficiency.getMin();
			return (double) miles / mpg;
		}

		public String getName() {
			return this.name;
		}

	}

	class EfficientCar extends Car {
		public EfficientCar(String name) {
			this.name = name;
			this.fuelEfficiency = FuelType.EFFICIENT;
		}
	}

	class AcceptableCar extends Car {
		public AcceptableCar(String name) {
			this.name = name;
			this.fuelEfficiency = FuelType.ACCEPTABLE;
		}
	}

	class GasGuzzler extends Car {
		public GasGuzzler(String name) {
			this.name = name;
			this.fuelEfficiency = FuelType.GAS_GUZZLER;
		}
	}

	class SomeNewCar extends Car {
		public SomeNewCar(String name) {
			this.name = name;
			this.fuelEfficiency = FuelType.GAS_GUZZLERMAX;
		}
	}

	public class FuelTest {

		public static void main(String[] args) {
			Car[] cars = new Car[4];
			cars[0] = new EfficientCar("2015 Jupiter CX");
			cars[1] = new AcceptableCar("2015 SoSo");
			cars[2] = new GasGuzzler("2015 Guzzly");
			cars[3] = new SomeNewCar("2016 WomWom");
			int miles = 1000;

			for (Car car : cars) {
				System.out.printf("To drive %d miles in a \"%s\",%n"
								+ "you need between %.2f and %.2f gallons "
								+ "of gasoline.%n%n",
						miles, car.name,
						car.calculateMinGasUsage(miles),
						car.calculateMaxGasUsage(miles));
			}
		}
	}

