package product.conventions;

import java.util.Date;

public interface HolidayCalendar extends Convention {
	public boolean isHoliday(Date date);
}