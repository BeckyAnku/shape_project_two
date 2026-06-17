public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);

        if (width <= 0 || height <= 0) {
            throw new InvalidShapeException("Rectangle width and height must be positive.");
        }

        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = width * height;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * width + 2 * height;
        return perimeter;
    }

    @Override
    public void resize(double factor) {
        if (factor <= 0) {
            throw new InvalidShapeException("Resize factor is not valid.");
        }

        width = width * factor;
        height = height * factor;
    }

    @Override
    public String toString() {
        return "Rectangle width: " + width + ", height: " + height + ", " + super.toString();
    }
}
