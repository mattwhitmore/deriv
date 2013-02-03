package product;

import core.LegalEntity;


public interface Derivative extends Product {
	public LegalEntity getCounterparty();
}