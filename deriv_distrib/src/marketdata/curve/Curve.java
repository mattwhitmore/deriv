package marketdata.curve;

import java.util.Date;

import marketdata.MarketData;

public interface Curve extends MarketData {
	public Date getDate();
	public double getDF();
}
