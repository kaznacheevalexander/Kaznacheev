package ua.kh.alexander.lessons;

public class VectorRun {
	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add(20);
		vector.add(14);
		vector.add(11);
		System.out.println(vector);

		vector.clean();
		System.out.println(vector);
	}
}
