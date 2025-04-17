import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int array[] = {23, 33, 22, 23, 44, 32};
        try {
            System.out.println("Enter three numbers");
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            float ans = a / (float)(b - c);  // Cast to float for proper division
            System.out.println("answer " + ans);
            
            System.out.println("Enter the index to get an element from array:");
            int i = s.nextInt();
            System.out.println("Element at index " + i + " is " + array[i]);
            
            System.out.println("Enter a number:");
            i = Integer.parseInt(s.next());
            System.out.println("You entered " + i);
            
            System.out.println("Good attempt");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } catch (Exception e) {  // Catch-all for any other exceptions
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
