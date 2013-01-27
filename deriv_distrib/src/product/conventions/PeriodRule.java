package product.conventions;

import java.util.Date;

import product.cashflow.period.Period;

public interface PeriodRule {
	public Date generateDateFrom(Period period);
}