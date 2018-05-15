package sedinta10.serialization;

import java.io.*;

public class MainSerialization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileDatabase db = new FileDatabase();

		Car car1 = new Car("Dacia", "Logan", 175);
		Car car2 = new Car("Ford", "Fiesta ST", 222);
		Car car3 = new Car("Subaru", "Imprezza WRX STI", 275);

		db.getCars().add(car1);
		db.getCars().add(car2);
		db.getCars().add(car3);

		db.getOwners().add(new Owner("Ion"));
		db.getOwners().add(new Owner("Gheo"));

		saveData(db);

		FileDatabase db2 = loadData();

		System.out.println(db2);
		System.out.println(db2.getCars().get(0));
	}

	private static FileDatabase loadData() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("database.ser")));
		FileDatabase db = (FileDatabase) ois.readObject();
		ois.close();
		return db;
	}

	private static void saveData(FileDatabase db) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("database.ser")));
		oos.writeObject(db);
		oos.close();
	}

}
