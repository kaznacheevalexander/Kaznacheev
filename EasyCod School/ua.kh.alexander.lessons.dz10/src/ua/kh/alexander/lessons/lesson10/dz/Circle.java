package ua.kh.alexander.lessons.lesson10.dz;

public class Circle extends Figure {
    private Point cender;

    private double radius;

    public Circle(Point a, double r) throws CloneNotSupportedException {
        setCircle(a, r);
    }

    public void setCircle(Point a, double r) throws CloneNotSupportedException {
        this.setCender(a.clone());
        this.radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

	public Point getCender() {
		return cender;
	}

	public void setCender(Point cender) {
		this.cender = cender;
	}
}
