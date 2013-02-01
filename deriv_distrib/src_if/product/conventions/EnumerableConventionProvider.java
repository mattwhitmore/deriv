package product.conventions;

import java.util.Vector;

public interface EnumerableConventionProvider<T extends EnumerableConvention> {
	public Vector<String> getAllNames();
	public T getStaticData(String name) throws Exception;
}
