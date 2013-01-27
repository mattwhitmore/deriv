package product.conventions;

import java.util.Date;

public interface HolidayCalendar extends EnumerableConvention {
	public boolean isHoliday(Date date);
}