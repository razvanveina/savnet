package singleton;

public class MainWithSingleton {

	public static void main(String[] args) {
		SingletonDatabase.getInstance().doSomething();
	}

	public void metNestatica() {
		SingletonDatabase.getInstance().doSomething();
	}
}
