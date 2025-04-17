import java.util.*;

class MyMath {
    static int square(int x) {
        return x * x;
    }

    static int cube(int x) {
        return x * x * x;
    }

    static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("power(8, 2) = " + MyMath.power(8, 2));
        System.out.println("square(7) = " + MyMath.square(7));
        System.out.println("cube(6) = " + MyMath.cube(6));
    }
}
