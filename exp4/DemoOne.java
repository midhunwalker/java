import java.util.*;

class Student {
    int admno;
    String name;
    String Class;
    static int count = 1;

    static int nextadmno() {
        return count++;
    }

    Student() {
        admno = Student.nextadmno();
    }

    Student(String name, String Class) {
        admno = Student.nextadmno();
        this.name = name;
        this.Class = Class;
    }

    void display() {
        System.out.println("Admission No: " + admno + ", Name: " + name + ", Class: " + Class);
    }
}

public class DemoOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] list = new Student[2];
        
        for (int i = 0; i < list.length; i++) {
            list[i] = new Student();
            System.out.println("Enter Student name:");
            list[i].name = scanner.next();
            System.out.println("Enter class:");
            list[i].Class = scanner.next(); 
        }

        for (int i = 0; i < list.length; i++) {
            list[i].display();
        }

        scanner.close();
    }
}
