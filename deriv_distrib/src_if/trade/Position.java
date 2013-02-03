package trade;

import product.Security;

public interface Position {
	public Security getSecurity();
	public double getPositionSize();
}