package product.index;

import java.util.Vector;

import product.conventions.AveragingMethodology;

public interface ResetAveraging extends Reset {
	public AveragingMethodology getAveragingMethodology();
	public Index getIndex();
	public Vector<Reset> getResets();
	public Vector<Double> getWeights();
}