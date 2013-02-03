package pricing.output;

import di.EnumerableComponent;

public interface PricingOutput<T> extends EnumerableComponent {
	public String getName();
	public String getType();
	public T getValue();
}