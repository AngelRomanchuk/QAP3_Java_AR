package Problem_two;

/**
 * Demonstrates the functionality of Point and MovablePoint classes.
 */
public class Demo {
    public static void main(String[] args) {
        // Test Point class
        Point p1 = new Point(2.5f, 3.5f);
        System.out.println("Point p1: " + p1);

        p1.setXY(5.0f, 7.0f);
        System.out.println("Updated Point p1: " + p1);

        // Test MovablePoint class
        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("MovablePoint mp1: " + mp1);

        // Move the MovablePoint and display the new position
        mp1.move();
        System.out.println("After moving mp1: " + mp1);

        // Update speed and move again
        mp1.setSpeed(2.0f, 3.0f);
        mp1.move();
        System.out.println("After changing speed and moving mp1 again: " + mp1);
    }
}

