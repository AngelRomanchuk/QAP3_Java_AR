package Problem_foure;

/**
 * Represents a Triangle shape.
 */
public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");

        // Validate triangle inequality
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Invalid sides for a triangle.");
        }
    }

    // Compute area using Heron's formula
    @Override
    public double getArea() {
        double s = getPerimeter() / 2.0; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Compute perimeter
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Scale the sides
    @Override
    public void scale(double factor) {
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }
}

