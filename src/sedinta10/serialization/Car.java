package sedinta10.serialization;

import java.io.Serializable;

public class Car implements Serializable {
	private static final long serialVersionUID = 2L;

	private String brand;
	private String model;
	private int topSpeed;
	private int hp;

	public Car(String brand, String model, int topSpeed) {
		super();
		this.brand = brand;
		this.model = model;
		this.topSpeed = topSpeed;
	}

	@Override
	public String toString() {
		return "{" + hp + "}Car [brand=" + brand + ", model=" + model + ", topSpeed=" + topSpeed + "]";
	}

}
