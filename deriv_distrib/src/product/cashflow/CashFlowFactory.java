package product.cashflow;

import java.util.Date;
import java.util.Vector;

import product.cashflow.period.Period;
import product.conventions.AveragingMethodology;
import product.conventions.CompoundingMethodology;
import product.conventions.DateRoll;
import product.conventions.DayCount;
import product.conventions.Frequency;
import product.conventions.HolidayCalendar;
import product.conventions.PeriodRule;
import product.currency.Currency;

public interface CashFlowFactory {
	public CashFlow buildPayment(Currency currency, Date paymentDate, double amount);
	public CashFlowFixed buildFixedCoupon(
			Currency currency, double notional, Period period, double rate, DayCount accrualDayCount, 
			PeriodRule pmtRule, DateRoll pmtDateRoll, Vector<HolidayCalendar> pmtHolidays
			);
	public CashFlowFloating buildFloatingCoupon(
			Currency currency, double notional, Period period, double spread, DayCount accrualDayCount, 
			PeriodRule resetRule, int resetLag, Vector<HolidayCalendar> resetHolidays,
			PeriodRule pmtRule, DateRoll pmtDateRoll
			);
	public CashFlowFloatingCompounding buildFloatingCompoundingCoupon(
			Currency currency, Vector<Double> notional, Vector<Double> periods, double spread, DayCount accrualDayCount, 
			PeriodRule resetRule, int resetLag, Vector<HolidayCalendar> resetHolidays,
			PeriodRule pmtRule, DateRoll pmtDateRoll, CompoundingMethodology cmpdMethod
			);
	public CashFlowAveraging buildAveragingCoupon(
			Currency currency, double notional, Period period, double spread, DayCount accrualDayCount, 
			PeriodRule resetRule, int resetLag, Vector<HolidayCalendar> resetHolidays,
			PeriodRule pmtRule, DateRoll pmtDateRoll, Frequency avgFreq, AveragingMethodology avgMethod
			);
}
