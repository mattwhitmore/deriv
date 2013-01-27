package product.cashflow;

import java.util.Date;

import product.conventions.DayCount;


public interface CashFlowInterest extends CashFlow {
	public double getNotional();
	public Date getStartDate();
	public Date getEndDate();
	public DayCount getDayCount();
}