package product.conventions;

import java.util.Vector;

import product.cashflow.period.FloatingCompoundingPeriod;


public interface CompoundingMethodology extends EnumerableConvention {
	public double getAmount(Vector<FloatingCompoundingPeriod> periods);	
}