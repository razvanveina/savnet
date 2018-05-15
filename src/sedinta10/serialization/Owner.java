package sedinta10.serialization;

import java.io.Serializable;

public class Owner implements Serializable {
	private String owner;

	public Owner(String owner) {
		super();
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Owner [owner=" + owner + "]";
	}

}
