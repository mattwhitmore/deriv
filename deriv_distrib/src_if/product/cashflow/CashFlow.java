package product.cashflow;

import java.util.Date;

import product.conventions.PayReceive;

import core.Currency;

public interface CashFlow
{
	public PayReceive getPayReceive();
	public Date getPaymentDate();
	public Currency getCurrency();
	public double getAmount();
}