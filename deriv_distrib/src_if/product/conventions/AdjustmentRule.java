package product.conventions;

import product.cashflow.Period;

public interface AdjustmentRule extends Convention {
	public Period adjustPeriod(Period period);
}