package core;

import java.util.Date;

import product.Product;

public interface Trade {
	public long getTradeId();
	public Date getTradeDate();
	public Product getProduct();
}