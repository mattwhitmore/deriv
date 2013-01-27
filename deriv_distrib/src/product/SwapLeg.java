package product;

import java.util.Date;

import product.conventions.PayReceive;

public interface SwapLeg extends Derivative {
	public PayReceive getPayReceive();
	public Date getStartDate();
	public Date getMaturityDate();
}