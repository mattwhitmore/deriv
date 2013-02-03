package product.conventions;

import java.util.Date;
import java.util.Vector;

import product.cashflow.Period;

public interface PeriodGenerationRule extends Convention {
	public Vector<Period> generateReferencePeriods(Date start, Date end, Frequency freq);
}