package pricing;

import java.util.Vector;

import pricing.dependency.Dependency;
import product.Product;

public interface Pricer<T extends Product> {
	public Vector<Dependency> getDependencies();
}
