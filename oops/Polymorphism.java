
// compile time polymorphism

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    void display(String name){
        System.out.println(name);
    }
    void display(int age){
        System.out.println(age);
    }
    void display(String name , int age){
        System.out.println(name);
        System.out.println(age);
    }

}

public class Polymorphism {
    public static void main(String args[]) {
            Person p1 = new Person("yuvi" , 20);
            // p1.display("kajal" , 25);
            // p1.display("Shivani");
            // p1.display("Shivani");
    }
}