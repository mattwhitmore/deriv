package product.conventions;

import java.util.Date;
import java.util.Vector;

public interface DateRoll {
	public Date roll(Date date, Vector<HolidayCalendar> holidays);
}