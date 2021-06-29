package Comparable;

public class Circle extends Shape implements Comparable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }


    public int compareTo (Circle c1) {
        if (getRadius() > c1.getRadius()) return 1;
        else if (getRadius() < c1.getRadius()) return -1;
        else return 1;
    }

    @Override
    public int compareTo() {
        return 0;
    }
}
