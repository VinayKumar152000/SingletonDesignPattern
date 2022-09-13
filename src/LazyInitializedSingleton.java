
//instance will be created in public getInstance method when actually client wants it
//saves memory
public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {

	}

	public static LazyInitializedSingleton getInstance() {

		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}

}
