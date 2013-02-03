package di;

import java.util.Vector;

public interface EnumerableComponentProvider<T extends EnumerableComponent> {
	public Vector<String> getAvailableComponents();
	public T getComponent(String name);
}
