package product.index;

import java.util.Date;

import product.conventions.Convention;

public interface Reset  {
	public Index getIndex();
	public Date getResetDate();
	public double getReset();
	public void setReset(double reset);
}