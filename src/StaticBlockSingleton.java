
//similar to eager only difference is that allows exception handling as instance is initialized in static block
public class StaticBlockSingleton {

	static private StaticBlockSingleton instance;

	private StaticBlockSingleton() {

	}

	// static block
	{
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
