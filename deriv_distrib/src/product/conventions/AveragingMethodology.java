package product.conventions;

import java.util.Date;
import java.util.Vector;

import product.index.Reset;

public interface AveragingMethodology extends EnumerableConvention {
	public Frequency getFrequency();
	public void generateResets(Date start, Date end, Vector<HolidayCalendar> holidays, Vector<Reset> resets, Vector<Double> weights);
}