package EnumInClass;

public enum FuelType {
	EFFICIENT(33, 55),
	ACCEPTABLE(20, 32),
	GAS_GUZZLER(3, 19),
	GAS_GUZZLERMAX(1, 3);

	private int min;
	private int max;

	FuelType(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return this.min;
	}

	public int getMax() {
		return this.max;
	}
}