package Problem_three;

/**
 * Represents an Equilateral Triangle (a special case of a Triangle).
 */
public class EquilateralTriangle extends Triangle {

    // Constructor
    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.name = "Equilateral Triangle"; // Override name
    }
}

