package util;

import java.util.Vector;

public interface Interpolator {
	public void setPoints(Vector<Double> x, Vector<Double> y);
	public Vector<Double> getX();
	public Vector<Double> getY();
	public double interpolate(double x);
}