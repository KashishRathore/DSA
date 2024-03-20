class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
        // this keyword shows that which object is trying to access at the scope
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    // Constructor
    // Student(){
    // System.out.println("constructor called");
    // }

    // Constructor with parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    Student() {

    }
}

public class OOPs {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();
        pen1.printColor();
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;

        // Constructor with parameters
        // Student s1 = new Student("aman" , 24);

        // Copy Constructor
        Student s2 = new Student(s1);

        s1.printInfo();
        s2.printInfo();

    }
}
