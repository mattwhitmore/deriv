package product.conventions;

public enum LongShort {
	LONG (1),
	SHORT (-1);
	private final int mult;
	LongShort(int m) {this.mult = m;}
	int mult() {return mult;}
}
