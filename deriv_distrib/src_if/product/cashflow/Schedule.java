package product.cashflow;


public interface Schedule<T> {
	public int size();
	public Period getPeriod(int i);
	public T getValue(int i);
	public void setValue(int i, T t);
	public void addPeriod(Period p, T t);
}