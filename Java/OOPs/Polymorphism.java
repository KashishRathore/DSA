class Student1 {

    public String name;
    public int age;

    // function overloading
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        // function overloading
        Student1 s1 = new Student1();
        s1.name = "aman";
        s1.age = 30;
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);

    }
}
