package product.cashflow;

import product.index.Reset;

public interface FloatingCompoundingPeriod extends AccrualPeriod {
	public Reset getReset();
	public double getSpread();
}