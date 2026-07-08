class Student {
    String name = "Kalpana";
    int age = 19;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
