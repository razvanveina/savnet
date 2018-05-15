package sedinta10.serialization;

import java.io.Serializable;

public class Car implements Serializable {
	private String brand;
	private String model;
	private int topSpeed;

	public Car(String brand, String model, int topSpeed) {
		super();
		this.brand = brand;
		this.model = model;
		this.topSpeed = topSpeed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", topSpeed=" + topSpeed + "]";
	}

}
