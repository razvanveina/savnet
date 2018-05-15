package sedinta10.serialization;

import java.io.*;
import java.util.*;

public class MainSerialization2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Car car1 = new Car("Dacia", "Logan", 175);
		Car car2 = new Car("Ford", "Fiesta ST", 222);
		Car car3 = new Car("Subaru", "Imprezza WRX STI", 275);

		List<Car> list = new ArrayList<Car>();
		list.add(car1);
		list.add(car2);
		list.add(car3);

		saveData(list);

		List<Car> cars = loadData();
		System.out.println(cars);
	}

	private static List<Car> loadData() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("database.ser")));
		List<Car> cars = (List<Car>) ois.readObject();
		ois.close();
		return cars;
	}

	private static void saveData(List<Car> list) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("database.ser")));
		oos.writeObject(list);
		oos.close();
	}

}
