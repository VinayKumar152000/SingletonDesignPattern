
public class Runner {

	public static void main(String args[]) {
		EagerInitializedSingleton instance = EagerInitializedSingleton.getInstance();
		System.out.println(instance);

		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		System.out.println(instance1);
		BillPughSingleton instance2 = BillPughSingleton.getInstance();
		System.out.println(instance2);

		EnumSingleton instance3 = EnumSingleton.getInstance();
		System.out.println(instance3);
	}
}
