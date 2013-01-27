package product.cashflow;

import product.index.RateReset;

public interface CashFlowFloating extends CashFlowInterest {
	public RateReset getRateReset();
	public double getSpread();
}
