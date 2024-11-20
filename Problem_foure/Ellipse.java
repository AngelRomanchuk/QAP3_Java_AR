package Problem_foure;

/**
 * Represents an Ellipse shape.
 */
public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    // Constructor
    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        if (axis1 > axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    // Compute area
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    // Compute perimeter (approximation)
    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    // Scale the axes
    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }
}
