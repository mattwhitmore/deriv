package product.cashflow;

import product.index.RateResetAveraging;

public interface CashFlowAveraging extends CashFlowInterest {
	public RateResetAveraging getRateReset();
	public double getSpread();
}
