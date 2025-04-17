import java.util.*;

class Point2D {
    int x, y;

    Point2D() {
        System.out.println("Default constructor executed");
        x = 0;
        y = 0;
    }

    Point2D(int a) {
        System.out.println("One argument constructor executed");
        x = a;
    }

    Point2D(int a, int b) {
        System.out.println("Two argument constructor executed");
        x = a;
        y = b;
    }

    void display() {
        System.out.println("x=" + x + ", y=" + y);
    }
}

public class ConstructorDemo {
    static void displayPoint(Point2D point) {
        point.display();
    }

    static Point2D createPoint2D(int a, int b) {
        return new Point2D(a, b);
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of points:");
        int n = scanner.nextInt();
        Point2D[] p = new Point2D[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the x and y coordinates:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            p[i] = createPoint2D(a, b);
        }
        for (int i = 0; i < n; i++) {
            displayPoint(p[i]);
        }
    }
}
