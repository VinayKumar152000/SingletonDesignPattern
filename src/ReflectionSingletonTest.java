import java.lang.reflect.Constructor;

//using reflection destorying singleton pattern
public class ReflectionSingletonTest {

	public static void main(String args[]) {

		LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton instance2 = null;

		try {
			// getconstructor gives only public construcotr and getdeclaredconstructors
			// gives all types of access modifier constructors

			Constructor[] constructors = LazyInitializedSingleton.class.getDeclaredConstructors();
			// below code will destory singleton pattern

			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instance2 = (LazyInitializedSingleton) constructor.newInstance();
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
