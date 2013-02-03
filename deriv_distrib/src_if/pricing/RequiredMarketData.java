package pricing;

import core.Currency;
import product.index.Index;

public interface RequiredMarketData {
	public String getPurpose();
	public Currency getCurrency();
	public String getMarketDataType();
	public Index getIndex();
	
	
}