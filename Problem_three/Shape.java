package Problem_three;

/**
 * Abstract base class for all shapes.
 */
public abstract class Shape {
    protected String name; // Name of the shape

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods to compute area and perimeter
    public abstract double getArea();
    public abstract double getPerimeter();

    // Override toString to return name, area, and perimeter
    @Override
    public String toString() {
        return "Shape: " + name +
               ", Area: " + getArea() +
               ", Perimeter: " + getPerimeter();
    }
}
