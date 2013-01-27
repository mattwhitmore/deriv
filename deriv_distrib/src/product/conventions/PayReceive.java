package product.conventions;

public enum PayReceive {
	PAY (-1),
	RECIEVE (1);
	private final int mult;
	PayReceive(int m) {this.mult = m;}
	int mult() {return mult;}
}
