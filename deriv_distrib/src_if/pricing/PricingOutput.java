package pricing;

import di.EnumerableComponent;

public interface PricingOutput extends EnumerableComponent {
	public String getName();
	public double getValue();
	public String getValueString();
	// extra space just in case
	public Object getValueObject();
	
}