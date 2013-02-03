package trade;

import product.Security;

public interface TradeSecurity extends Trade {
	public double getTradeSize();
	public Security getSecurity();
}
