package Problem_foure;

/**
 * Represents a Circle (a special case of an Ellipse).
 */
public class Circle extends Ellipse {

    // Constructor
    public Circle(double radius) {
        super(radius, radius);
        this.name = "Circle"; // Override name
    }

    // Scale the radius (uses Ellipse's scale method)
    @Override
    public void scale(double factor) {
        super.scale(factor);
    }
}

