package sedinta10.serialization;

import java.io.Serializable;
import java.util.*;

public class FileDatabase implements Serializable {
	private List<Car> cars = new ArrayList<Car>();
	private List<Owner> owners = new ArrayList<Owner>();

	public List<Car> getCars() {
		return cars;
	}

	public List<Owner> getOwners() {
		return owners;
	}

	@Override
	public String toString() {
		return "FileDatabase [cars=" + cars + ", owners=" + owners + "]";
	}

}
