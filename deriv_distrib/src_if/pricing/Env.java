package pricing;

import marketdata.MarketData;

public interface Env {
	public MarketData getMarketData(RequiredMarketData dependency);
}
