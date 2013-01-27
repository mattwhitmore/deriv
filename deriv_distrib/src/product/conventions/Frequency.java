package product.conventions;

import java.util.Date;

public interface Frequency extends EnumerableConvention {
	public Date addFrequency(Date date);
	public Date subtractFrequency(Date date);
	public int days30360();
}