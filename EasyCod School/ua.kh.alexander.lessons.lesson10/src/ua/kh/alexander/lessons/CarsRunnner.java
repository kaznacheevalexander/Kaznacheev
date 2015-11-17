package ua.kh.alexander.lessons;

public class CarsRunnner {
	@Override
	public String toString() {
		return "CarsRunnner [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public static void main(String[] args) {
		Cars p = new Cars();
		p.setmodel("Toyota");
		p.setmake("Camry");
		p.setcolor("White");
		p.setrelease(2010);
		System.out.println(p.getmodel());
		System.out.println(p.getmake());
		System.out.println(p.getcolor());
		System.out.println(p.getrelease());
	}
}
