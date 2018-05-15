package singleton;

public class MainWithoutSingleton {
	static Database db = new Database();

	public static void main(String[] args) {
		db.doSomething();
	}

	public void metNestatica() {
		db.doSomething();
	}
}
