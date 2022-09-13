
//eager loading singleton class
public class EagerInitializedSingleton {

	// instance is created even though client don't want it
	// in this we can't also not do exception handling
	static private EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// private constructor to avaoid client application to use it for object
	// initialization
	private EagerInitializedSingleton() {

	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}
