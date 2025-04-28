public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        this.radius = 1.0;
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
        return Math.round(Math.PI * radius * radius*100.0) / 100.0;
    }

    public double getPerimeter() {
        return Math.round(2 * Math.PI * radius*100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
