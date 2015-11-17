package ua.kh.alexander.lessons.lesson10.dz;

public class Triangle extends Figure {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) throws CloneNotSupportedException {
        setTriangle(a, b, c);
    }

    public void setTriangle(Point a, Point b, Point c) throws CloneNotSupportedException {
        this.a = a.clone();
        this.b = b.clone();
        this.c = c.clone();
    }

    @Override
    public double getArea() {
        return (double) Math.abs((b.x - a.x) * (c.y - a.y) - (c.x - a.x) * (b.y - a.y)) / 2;
    }

    @Override
    public double getPerimeter() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }
}