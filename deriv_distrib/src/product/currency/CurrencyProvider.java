package product.currency;

import java.util.Vector;

public interface CurrencyProvider {
	public Vector<String> getAllCurrencies();
	public Currency getCurrency(String name);
}