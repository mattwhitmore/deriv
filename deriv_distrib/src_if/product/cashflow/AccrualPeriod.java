package product.cashflow;

import product.conventions.DayCount;

public interface AccrualPeriod extends Period {
	public double getNotional();
	public DayCount getDayCount();
}