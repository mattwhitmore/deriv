package product.cashflow.period;

import product.index.Reset;

public interface FloatingCompoundingPeriod extends AccrualPeriod {
	public Reset getReset();
	public double getSpread();
}