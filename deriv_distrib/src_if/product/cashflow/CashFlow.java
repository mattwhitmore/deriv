package product.cashflow;

import java.util.Date;

import core.Currency;


public interface CashFlow
{
	public Date getPaymentDate();
	public Currency getCurrency();
	public double getAmount();
}