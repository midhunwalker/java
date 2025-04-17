import java.util.Scanner;

class Product {
    int productNo;
    String productName;
    double cost;
    double quantity;

    void display() {
        System.out.println("Product No: " + productNo);
        System.out.println("Product Name: " + productName);
        System.out.println("Cost: " + cost);
        System.out.println("Quantity: " + quantity);
    }

    void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product details (product no, product name, cost, quantity):");
        productNo = scanner.nextInt();
        productName = scanner.next();
        cost = scanner.nextDouble();
        quantity = scanner.nextDouble();
    }
}

public class BillName {
    public static void main(String[] args) {
        Product[] bill = new Product[5];
        for (int i = 0; i < 5; i++) {
            bill[i] = new Product();
            bill[i].read();
        }
        for (int i = 0; i < 5; i++) {
            bill[i].display();
        }
    }
}
