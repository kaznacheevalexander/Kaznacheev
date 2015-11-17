package ua.kh.alexander.lessons;

import java.util.Arrays;

public class Vector {
	private int[] array;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(array);
		result = prime * result + size;
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
		Vector other = (Vector) obj;
		if (!Arrays.equals(array, other.array))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	private int size;

	public int getSize() {
		return size;
	}

	public Vector() {
		size = 0;
		array = new int[12];
	}

	public void add(int n) {
		array[size] = n;
		size++;
	}

	@Override
	public String toString() {
		return "Vector [array=" + Arrays.toString(array) + ", size=" + size + "]";
	}

	public void clean() {
		size = 0;
	}
}
