package marketdata;

import java.util.Date;
import java.util.Vector;


public interface Curve extends MarketData {
	public Date getDate();
	public double getValue(Date date);
	public Vector<Date> getPointDates();
	public Vector<Double> getPointValues();
	public void setPoints(Vector<Date> dates, Vector<Double> values);
	public String getInterpolatorType();
}
