

import java.util.*;

class circle {
    double radius;
    static double pi = 3.14;

    public circle() {
        radius = 0;
    }

    public circle(double r) {
        radius = r;
    }

    public double area() {
        return radius * radius * pi;
    }

    public double circumference() {
        return 2 * pi * radius;
    }
}

class cylinder extends circle {
    double height;

    public cylinder() {
        radius = 0;
        height = 0;
    }

    public cylinder(double r, double h) {
        super(r);
        height = h;
    }

    public double surfaceArea() {
        return 2 * area() + circumference() * height;
    }

    public double volume() {
        return area() * height;
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        circle c = new circle(radius);
        System.out.println("Area of circle: " + c.area());
        System.out.println("Circumference of circle: " + c.circumference());

        System.out.println("Enter the radius of the cylinder:");
        radius = scanner.nextDouble();
        System.out.println("Enter the height of the cylinder:");
        double height = scanner.nextDouble();
        cylinder c1 = new cylinder(radius, height);
        System.out.println("Surface area of cylinder: " + c1.surfaceArea());
        System.out.println("Volume of cylinder: " + c1.volume());
    }
}
