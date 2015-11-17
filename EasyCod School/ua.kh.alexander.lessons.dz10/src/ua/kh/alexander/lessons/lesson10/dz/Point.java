package ua.kh.alexander.lessons.lesson10.dz;

public class Point implements Cloneable {
    public int x, y;

    public Point(int x, int y) {
        setPoint(x, y);
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point clone(Point from) {
        this.x = from.x;
        this.y = from.y;

        return this;
    }

    public Point clone() throws CloneNotSupportedException {
        Point obj = (Point) super.clone();
        obj.x = this.x;
        obj.y = this.y;
        return obj;
    }

    public static double distance(Point from, Point to) {
        return Math.sqrt(Math.pow(from.x - to.x, 2) + Math.pow(from.y - to.y, 2));
    }

    public double distance(Point to) {
        return distance(this, to);
    }

    public static Point rectangleProjection(Point x, Point y) {
        return new Point(x.x, y.y);
    }

    public Point rectangleProjection(Point y) {
        return rectangleProjection(this, y);
    }
}