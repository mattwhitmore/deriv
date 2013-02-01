package product.index;

import java.util.Date;

import product.conventions.DayCount;

public interface RateIndex extends Index {
	public Date getStartDate(Date reset);
	public Date getEndDate(Date startDate);
	public DayCount getDayCount();
}