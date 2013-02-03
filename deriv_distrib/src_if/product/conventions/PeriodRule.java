package product.conventions;

import java.util.Date;

import product.cashflow.Period;

public interface PeriodRule {
	public Date generateDateFrom(Period period);
}