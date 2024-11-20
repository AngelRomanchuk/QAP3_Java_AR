package Problem_three;

/**
 * Represents a Circle (a special case of an Ellipse).
 */
public class Circle extends Ellipse {

    // Constructor
    public Circle(double radius) {
        super(radius, radius);
        this.name = "Circle"; // Override name
    }
}

