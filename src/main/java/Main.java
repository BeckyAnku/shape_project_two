public class Main {

    public static void main(String[] args) {
        Shape[] list = new Shape[4];

        list[0] = new Circle(4, "pink", true);
        list[1] = new Rectangle(3, 7, "brown", false);
        list[2] = new Triangle(5, 5, 6, "cyan", true);
        list[3] = new Circle(2, "white", false);

        printAreas(list);

        Shape biggest = largest(list);

        System.out.println();
        System.out.println("Largest shape found:");
        System.out.println(biggest);
        System.out.println("Its area is " + biggest.getArea());

        System.out.println();
        System.out.println("Resize the triangle by 3:");
        list[2].resize(3);
        System.out.println(list[2]);
        System.out.println("Triangle area after resize is " + list[2].getArea());

        System.out.println();
        System.out.println("Now try a wrong triangle:");

        try {
            Triangle bad = new Triangle(1, 2, 3, "red", false);
            System.out.println(bad);
        } catch (InvalidShapeException error) {
            System.out.println("The exception was caught.");
            System.out.println(error.getMessage());
        }
    }

    public static void printAreas(Shape[] list) {
        System.out.println("Shape areas:");

        for (int i = 0; i < list.length; i++) {
            double area = list[i].getArea();
            System.out.println("Shape " + i + ": " + list[i]);
            System.out.println("Area: " + area);
        }
    }

    public static Shape largest(Shape[] list) {
        Shape biggest = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i].getArea() > biggest.getArea()) {
                biggest = list[i];
            }
        }

        return biggest;
    }
}
