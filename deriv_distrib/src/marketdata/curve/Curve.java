package marketdata.curve;

import java.util.Date;
import java.util.Vector;

import marketdata.MarketData;

public interface Curve extends MarketData {
	public Date getDate();
	public double getValue();
	public Vector<Date> getPointDates();
	public Vector<Double> getPointValues();
	public void setPoints(Vector<Date> dates, Vector<Double> values);
	public String getInterpolatorType();
}
