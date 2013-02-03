package product.cashflow;

import java.util.Vector;

import product.conventions.CompoundingMethodology;


public interface CashFlowFloatingCompounding extends CashFlow {
	public Vector<FloatingCompoundingPeriod> getCompoundingPeriods();
	public CompoundingMethodology getCompoundingMethodology();
}
