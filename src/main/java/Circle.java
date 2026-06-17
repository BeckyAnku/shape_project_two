public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);

        if (radius <= 0) {
            throw new InvalidShapeException("Circle radius is not valid.");
        }

        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public void resize(double factor) {
        if (factor <= 0) {
            throw new InvalidShapeException("Resize factor is not valid.");
        }

        radius = radius * factor;
    }

    @Override
    public String toString() {
        return "Circle radius: " + radius + ", " + super.toString();
    }
}
