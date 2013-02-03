package core;

public interface Amount {
	public double getValue();
	public Currency getCurrency();
	public void addAmount(Amount newAmt);
	public void multiply(double mult);
}