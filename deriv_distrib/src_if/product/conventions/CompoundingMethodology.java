package product.conventions;

import java.util.Vector;

import product.cashflow.FloatingCompoundingPeriod;


public interface CompoundingMethodology extends Convention {
	public double getAmount(Vector<FloatingCompoundingPeriod> periods);	
}