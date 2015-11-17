package ua.kh.alexander.lessons.lesson10.dz;

public class Rectangle extends Figure {

	private Point a, b;

	public Rectangle(Point a, Point b) throws CloneNotSupportedException {
		setRectangle(a, b);
	}

	public void setRectangle(Point a, Point b) throws CloneNotSupportedException {
		this.a = a.clone();
		this.b = b.clone();
	}

	@Override
	public double getArea() {
		Point z = a.rectangleProjection(b);
		return a.distance(z) * b.distance(z);
	}

	public double getPerimeter() {
		Point z = a.rectangleProjection(b);
		return 2 * (a.distance(z) + b.distance(z));
	}
}