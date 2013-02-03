package trade;

import java.util.Date;
import java.util.Vector;

import core.LegalEntity;

public interface Trade {
	public long getTradeId();
	public LegalEntity getCounterparty();
	public Date getTradeDate();
	public Vector<Fee> getFees();
}