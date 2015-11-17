package ua.kh.alexander.lessons.lesson12;

public class House {
	public String Street;
	public int NumberHouse;
	public int NumberOfFloors;

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public int getNumberHouse() {
		return NumberHouse;
	}

	public void setNumberHouse(int numberHouse) {
		NumberHouse = numberHouse;
	}

	public int getNumberOfFloors() {
		return NumberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		NumberOfFloors = numberOfFloors;
	}

	public House() {
		super();
	}

	public House(String street, int numberHouse, int numberOfFloors) {
		super();
		Street = street;
		NumberHouse = numberHouse;
		NumberOfFloors = numberOfFloors;
	}

	@Override
	public String toString() {
		return "House [Street=" + Street + ", NumberHouse=" + NumberHouse + ", NumberOfFloors=" + NumberOfFloors + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + NumberHouse;
		result = prime * result + NumberOfFloors;
		result = prime * result + ((Street == null) ? 0 : Street.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House other = (House) obj;
		if (NumberHouse != other.NumberHouse)
			return false;
		if (NumberOfFloors != other.NumberOfFloors)
			return false;
		if (Street == null) {
			if (other.Street != null)
				return false;
		} else if (!Street.equals(other.Street))
			return false;
		return true;
	}

}
