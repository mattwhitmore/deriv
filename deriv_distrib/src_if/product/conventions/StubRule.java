package product.conventions;

import java.util.Date;
import java.util.Vector;

import product.cashflow.period.Period;

public interface StubRule extends EnumerableConvention {
	public Vector<Period> generateReferencePeriods(Date start, Date end, Frequency freq);
}