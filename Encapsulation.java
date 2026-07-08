class Student {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Kalpana");
        s.setAge(19);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
