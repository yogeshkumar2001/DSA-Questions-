
class Student {
    String name;
    int age;

    void info() {
        System.out.println(name);
        System.out.println(age);
    }
    Student(String name , int age){
        this.name = name;
        this.age = age;
    }
}

class Pen {
    String type;
    String color;

    void penInfo() {

        System.out.println(this.type);
        System.out.println(this.color);
    }

    Pen(String type, String color) {
        this.type = type;
        this.color = color;
    }
}

public class ClassAndObjects {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.name = "Yogesh";
        // s1.age = 30;
        // s1.info();

        Pen p1 = new Pen("gel" , "Blue");
        p1.penInfo();
        System.out.println("-------------------------------------");
        Pen p2 = new Pen("ball" , "green");
        p2.penInfo();

        Student s2 = new Student("shivani" , 28);
        s2.info();

    }
}