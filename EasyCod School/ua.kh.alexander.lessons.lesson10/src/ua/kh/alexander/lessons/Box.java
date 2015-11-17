package ua.kh.alexander.lessons;

public class Box<T> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Box(T value) {
		this.value = value;
	}

	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>(3124);
		System.out.println(box.getValue());
		int value = (int) box.getValue();
	}
}
