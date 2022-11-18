import java.io.Serializable;

//Sometimes in distributed systems, we need to implement Serializable 
//interface in Singleton class so that we can store its state in the file system and retrieve it at a later point of time.

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}

	// readResolve -> so that singleton pattern don't get destoryed , this is becuase when we desearialize our object a new instance is created to avoid it we use
	//readResolve
	protected Object readResolve() {
		return getInstance();
	}

}
