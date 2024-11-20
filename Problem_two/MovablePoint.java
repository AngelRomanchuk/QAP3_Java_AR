package Problem_two;

/**
 * Represents a MovablePoint in 2D space, which can move based on speed.
 */
public class MovablePoint extends Point {
    private float xSpeed = 0.0f; // Speed in the X direction
    private float ySpeed = 0.0f; // Speed in the Y direction

    // Default constructor
    public MovablePoint() {
        super();
    }

    // Constructor with speeds only
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor with coordinates and speeds
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter for xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    // Setter for xSpeed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter for ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    // Setter for ySpeed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Sets both xSpeed and ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Returns xSpeed and ySpeed as an array
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Moves the point based on its speed
    public MovablePoint move() {
        setX(getX() + xSpeed); // Update x coordinate
        setY(getY() + ySpeed); // Update y coordinate
        return this;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}

