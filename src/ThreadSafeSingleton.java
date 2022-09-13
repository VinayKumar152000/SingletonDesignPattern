
//to create thread safe singleton class make getInstance method synchronized so that only thread can access it at a time
//this approach works fine but reduces performance of application by cost associated with it -> to avoid this we use double
//locking principle, we have synchronized block for if condition instead of synchronized for method
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {

	}

//	public static synchronized ThreadSafeSingleton getInstance() {
//		if (instance == null) {
//			instance = new ThreadSafeSingleton();
//		}
//
//		return instance;
//	}

	// better approach than above

	public static ThreadSafeSingleton getInstance() {
		if (instance == null) {

			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}

		return instance;
	}
}
