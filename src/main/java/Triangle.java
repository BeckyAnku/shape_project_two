public class Triangle extends Shape {

    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree, String color, boolean filled) {
        super(color, filled);

        if (sideOne <= 0 || sideTwo <= 0 || sideThree <= 0) {
            throw new InvalidShapeException("Triangle sides must be positive.");
        }

        if (sideOne + sideTwo <= sideThree) {
            throw new InvalidShapeException("Triangle sides are not valid.");
        }

        if (sideOne + sideThree <= sideTwo) {
            throw new InvalidShapeException("Triangle sides are not valid.");
        }

        if (sideTwo + sideThree <= sideOne) {
            throw new InvalidShapeException("Triangle sides are not valid.");
        }

        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        double area = Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideOne + sideTwo + sideThree;
        return perimeter;
    }

    @Override
    public void resize(double factor) {
        if (factor <= 0) {
            throw new InvalidShapeException("Resize factor is not valid.");
        }

        sideOne = sideOne * factor;
        sideTwo = sideTwo * factor;
        sideThree = sideThree * factor;
    }

    @Override
    public String toString() {
        return "Triangle sides: " + sideOne + ", " + sideTwo + ", " + sideThree
                + ", " + super.toString();
    }
}
