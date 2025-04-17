import java.util.Scanner;

class Person {
    protected String aadhar;
    protected String name;
    protected int age;
    protected String hometown;

    public Person() {
        this.aadhar = "";
        this.name = "";
        this.age = 0;
        this.hometown = "";
    }

    public Person(String aadhar, String name, int age, String hometown) {
        this.aadhar = aadhar;
        this.name = name;
        this.age = age;
        this.hometown = hometown;
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aadhar:");
        aadhar = scanner.next();
        System.out.println("Person Name:");
        name = scanner.next();
        System.out.println("Age:");
        age = scanner.nextInt();
        System.out.println("Hometown:");
        hometown = scanner.next();
    }

    public void display() {
        System.out.println("Person Details:");
        System.out.println("Aadhar: " + aadhar);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hometown: " + hometown);
    }
}

class Student extends Person {
    protected int rollno;
    protected String className;

    public Student() {
        super();
        this.rollno = 0;
        this.className = "";
    }

    public Student(String aadhar, String name, int age, String hometown, int rollno, String className) {
        super(aadhar, name, age, hometown);
        this.rollno = rollno;
        this.className = className;
    }

    public void read() {
        super.read();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Roll No:");
        rollno = scanner.nextInt();
        System.out.println("Class Name:");
        className = scanner.next();
    }

    public void display() {
        System.out.println("Student Details:");
        super.display();
        System.out.println("Roll No: " + rollno);
        System.out.println("Class Name: " + className);
    }
}

class Employee extends Person {
    protected int empid;
    protected String designation;
    protected double salary;

    public Employee() {
        super();
        this.empid = 0;
        this.designation = "";
        this.salary = 0.0;
    }

    public Employee(String aadhar, String name, int age, String hometown, int empid, String designation, double salary) {
        super(aadhar, name, age, hometown);
        this.empid = empid;
        this.designation = designation;
        this.salary = salary;
    }

    public void read() {
        super.read();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Employee ID:");
        empid = scanner.nextInt();
        System.out.println("Designation:");
        designation = scanner.next();
        System.out.println("Salary:");
        salary = scanner.nextDouble();
    }

    public void display() {
        System.out.println("Employee Details:");
        super.display();
        System.out.println("Employee ID: " + empid);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class Engineer extends Employee {
    protected String trade;

    public Engineer() {
        super();
        this.trade = "";
    }

    public Engineer(String aadhar, String name, int age, String hometown, int empid, String designation, double salary, String trade) {
        super(aadhar, name, age, hometown, empid, designation, salary);
        this.trade = trade;
    }

    public void read() {
        super.read();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Trade:");
        trade = scanner.next();
    }

    public void display() {
        System.out.println("Engineer Details:");
        super.display();
        System.out.println("Trade: " + trade);
    }
}

public class InnerInheritanceDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.read();
        p.display();

        Student student = new Student();
        student.read();
        student.display();

        Engineer engineer = new Engineer();
        engineer.read();
        engineer.display();

        Employee emp = new Employee();
        emp.read();
        emp.display();
    }
}
