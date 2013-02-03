package product;

import core.LegalEntity;

public interface Security extends Product {
	public String getIdentifier();
	public LegalEntity getIssuer();
	
}