package Problem_foure;

/**
 * Demonstrates the functionality of Shape and Scalable interface.
 */
public class Demo {

    // Static method to scale an array of Scalable objects
    public static void scaleShapes(Scalable[] shapes, double factor) {
        System.out.println("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        // Scale each shape
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }

        System.out.println("\nAfter Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void main(String[] args) {
        // Create an array of Scalable objects
        Scalable[] shapes = new Scalable[4];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Ellipse(7.0, 5.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle(6.0);

        // Scale the shapes with a factor of 2
        scaleShapes(shapes, 2.0);
    }
}
