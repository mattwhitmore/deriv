package pricing;

import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

import pricing.output.PricingOutput;
import product.Product;

public interface Pricer<T extends Product> {
	public Vector<RequiredMarketData> getDependencies();
	public HashMap<String,PricingOutput> price(Date date, Product product, Env env);
}
