package util;

public interface RateCompounding {
	public String getName();
	public double toDF(double rate, double t);
	public double fromDF(double df, double t);
}
