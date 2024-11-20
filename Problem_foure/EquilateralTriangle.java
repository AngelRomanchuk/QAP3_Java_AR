package Problem_foure;

/**
 * Represents an Equilateral Triangle (a special case of a Triangle).
 */
public class EquilateralTriangle extends Triangle {

    // Constructor
    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.name = "Equilateral Triangle"; // Override name
    }

    // Scale the sides (uses Triangle's scale method)
    @Override
    public void scale(double factor) {
        super.scale(factor);
    }
}
