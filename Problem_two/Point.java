package Problem_two;

/**
 * Represents a Point in 2D space.
 */
public class Point {
    private float x = 0.0f; // X-coordinate
    private float y = 0.0f; // Y-coordinate

    // Default constructor
    public Point() {
    }

    // Parameterized constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public float getX() {
        return x;
    }

    // Setter for x
    public void setX(float x) {
        this.x = x;
    }

    // Getter for y
    public float getY() {
        return y;
    }

    // Setter for y
    public void setY(float y) {
        this.y = y;
    }

    // Sets both x and y coordinates
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Returns x and y coordinates as an array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

