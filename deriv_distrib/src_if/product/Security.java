package product;

import core.LegalEntity;

public interface Security extends Product {
	public LegalEntity getIssuer();
}