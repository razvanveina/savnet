package singleton;

public class SingletonDatabase {
	private static SingletonDatabase instance;

	private SingletonDatabase() {
		//
	}

	public static SingletonDatabase getInstance() {
		if (instance == null) {
			instance = new SingletonDatabase();
		}

		return instance;
	}

	public void doSomething() {
	}
}
