package pricing.dependency;

import product.currency.Currency;

public interface Dependency {
	public String getName();
	public String getMarketDataType();
	public Currency getCurrency();
	public String getUsage();
}