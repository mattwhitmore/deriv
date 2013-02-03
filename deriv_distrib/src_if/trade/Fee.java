package trade;

import product.cashflow.CashFlow;

public interface Fee {
	public String getDescription();
	public CashFlow getCashFlow();
}