package product.conventions;

import java.util.Date;

public interface DayCount extends Convention {
	public int dayDiff(Date d1, Date d2);
	public double yearDiff(Date d1, Date d2);
}