public class BillPughSingleton {

	private BillPughSingleton() {
	}

	// single instance of the singleton class is created and it is also thread safe
	// Bill Pugh singleton implementaiton using static inner class->it is to address
	// memory issues prior in java 5 which makes
	// all discussed aprroach eager,lazy etc. fail for multiple threads

	private static class SingletonHelper {
		// it is loaded when getInstance is called and created instance of
		// BillPughSingleton class
		private static final BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.instance;
	}
}