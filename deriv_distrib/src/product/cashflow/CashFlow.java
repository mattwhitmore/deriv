package product.cashflow;

import java.util.Date;

import product.currency.Currency;

public interface CashFlow
{
	public Date getPaymentDate();
	public Currency getCurrency();
	public double getAmount();
}