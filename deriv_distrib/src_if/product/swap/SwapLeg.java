package product.swap;

import java.util.Date;

import product.Derivative;
import product.conventions.PayReceive;

public interface SwapLeg extends Derivative {
	public PayReceive getPayReceive();
	public Date getStartDate();
	public Date getMaturityDate();
}