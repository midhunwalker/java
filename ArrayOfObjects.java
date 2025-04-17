class Product {
    private int pro_Id;
    private String pro_name;

    // Product class constructor
    Product(int pid, String n) {
        pro_Id = pid;
        pro_name = n;
    }

    public int getPro_Id() {
        return pro_Id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void display() {
        System.out.println("Product Id = " + pro_Id + "  " + " Product Name = " + pro_name);
    }
}

public class ArrayOfObjects {
    public static void main(String args[]) {
        // create an array of product object
        Product[] obj = new Product[5];

        // create & initialize actual product objects using constructor
        obj[0] = new Product(23907, "Dell Laptop");
        obj[1] = new Product(91240, "HP 630");
        obj[2] = new Product(29823, "LG OLED TV");
        obj[3] = new Product(11908, "MI Note Pro Max 9");
        obj[4] = new Product(43590, "Kingston USB");

        // display the product object data
        for (int i = 0; i < obj.length; i++) {
            System.out.println("Product Object " + (i + 1) + ":");
            if (obj[i] != null) {
                obj[i].display();
            } else {
                System.out.println("No product at index " + i);
            }
        }
    }
}
