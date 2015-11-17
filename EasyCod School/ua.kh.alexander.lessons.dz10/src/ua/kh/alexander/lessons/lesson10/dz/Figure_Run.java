package ua.kh.alexander.lessons.lesson10.dz;

abstract public class Figure_Run {
	public static void main(String[] args) throws CloneNotSupportedException {

		Circle circle = new Circle(new Point(0, 0), 8);
		System.out.println("Периметр круга: " + circle.getPerimeter());
		System.out.println("Площадь круга: " + circle.getArea());

		Rectangle rectangle = new Rectangle(new Point(2, 2), new Point(6, 6));
		System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
		System.out.println("Площадь прямоугольника: " + rectangle.getArea());

		Triangle triangle = new Triangle(new Point(5, 5), new Point(2, 8), new Point(8, 2));
		System.out.println("Периметр треугольника: " + triangle.getPerimeter());
		System.out.println("Площадь треугольника: " + triangle.getArea());
	}
}
