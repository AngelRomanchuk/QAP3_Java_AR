package Problem_three;

/**
 * Demonstrates the functionality of Shape and its subclasses.
 */
public class Demo {
    public static void main(String[] args) {
        // Create an array of shapes
        Shape[] shapes = new Shape[4];

        // Add shapes to the array
        shapes[0] = new Circle(5.0);
        shapes[1] = new Ellipse(7.0, 5.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle(6.0);

        // Print details of each shape
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}

