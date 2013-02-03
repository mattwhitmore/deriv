package pricing;

import product.Currency;
import product.index.Index;

public interface RequiredMarketData {
	public String getPurpose();
	public Currency getCurrency();
	public String getMarketDataType();
	public Index getIndex();
	
	
}